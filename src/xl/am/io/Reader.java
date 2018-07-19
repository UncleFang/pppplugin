/**
 * 
 */
package xl.am.io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.inventory.ItemStack;

import pds.Plugin;
import pds.element.DataFile;
import pds.element.Group;
import pds.utils.ItemUtil;
import xl.am.module.condition.Condition;
import xl.am.module.condition.PlayerHasItemCondition;
import xl.am.module.condition.WeatherCondition;
import xl.am.module.prop.Prop;
import xl.am.module.result.CraftItem;
import xl.am.module.result.Result;

/**
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午2:25:19
 * @version 1.0
 */
public class Reader {
	/**
	 * 遍历文件夹
	 * 
	 * @param map
	 * @param group
	 * @param
	 * @return
	 * @date 创建时间：2018年7月18日 上午11:19:59
	 */
	@SuppressWarnings("unchecked")
	public static List<HashMap<String, Object>> FilesRecursion(Group group, String key) {
		List<HashMap<String, Object>> data = new ArrayList<>();
		File[] files = group.getFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				data.addAll(FilesRecursion(group.getGroup(file.getName()), key));
			} else if (group.getFile(file) instanceof DataFile) {
				DataFile datafile = (DataFile) group.getFile(file);
				datafile.load();
				Object temp = datafile.getData().getDatas().get(key);
				if (temp instanceof List) {
					data.addAll((List<HashMap<String, Object>>) temp);
				}
			}
		}
		return data;
	}

	/**
	 * 得到物品集合
	 * 
	 * @return 物品集合
	 * @date 创建时间：2018年7月17日 下午5:48:57
	 */
	public static HashMap<String, ItemStack> readItems() {
		HashMap<String, ItemStack> map = new HashMap<>();
		Group items = Plugin.manager.loadRoot("AllMightCraft").getGroup("items");
		readItemsRecursion(map, items);
		Plugin.manager.loadRoot("AllMightCraft").dispose("items");
		return map;
	}

	private static void readItemsRecursion(HashMap<String, ItemStack> map, Group items) {
		List<HashMap<String, Object>> itemIcons = FilesRecursion(items, "items");
		for (HashMap<String, Object> hashMap : itemIcons) {
			if (hashMap.containsKey("itemId")) {
				ItemStack item = ItemUtil.Map2Item(hashMap);
				map.put((String) hashMap.get("itemID"), item);
			}
		}
	}

	/**
	 * 
	 * 得到道具集合
	 * 
	 * @return 道具集合
	 * @date 创建时间：2018年7月18日 上午11:16:24
	 */
	public static HashMap<String, Prop> readProp() {
		HashMap<String, Prop> map = new HashMap<>();
		Group items = Plugin.manager.loadRoot("AllMightCraft").getGroup("props");
		readPropRecursion(items);
		return map;
	}

	@SuppressWarnings("unchecked")
	private static void readPropRecursion(Group items) {
		List<HashMap<String, Object>> props = FilesRecursion(items, "props");
		Prop prop = null;
		for (HashMap<String, Object> hashMap : props) {
			prop = new Prop();
			if (hashMap.containsKey("conditions")) {
				Object conditions = hashMap.get("conditions");
				if (conditions instanceof List) {
					prop.setConditions(readConditions((List<HashMap<String, Object>>) conditions));
				}
			}

			if (hashMap.containsKey("results")) {
				Object results = hashMap.get("results");
				if (results instanceof List) {
					List<HashMap<String, Object>> resultList = (List<HashMap<String, Object>>) results;
					prop.setResults(readResults(resultList));
				}
			}
		}
	}

	/**
	 * 得到条件集合
	 * 
	 * @param 未处理的条件集合
	 * @return 条件集合
	 * @date 创建时间：2018年7月18日 下午3:18:12
	 */
	@SuppressWarnings("unchecked")
	public static HashMap<String, Condition> readConditions(List<HashMap<String, Object>> conditionList) {
		HashMap<String, Condition> map = new HashMap<>();
		for (HashMap<String, Object> conditionMap : conditionList) {
			HashMap<String, Object> con = (HashMap<String, Object>) conditionMap.get("condition");
			map.put((String) con.get("name"), readCondition(con));
		}
		return map;
	}

	/**
	 * 得到条件对象
	 * 
	 * @param 未处理的条件
	 * @return 条件对象
	 * @date 创建时间：2018年7月18日 下午3:24:22
	 */
	@SuppressWarnings("unchecked")
	public static Condition readCondition(HashMap<String, Object> conditionMap) {
		Condition condition = null;
		String type = (String) conditionMap.get("type");
		HashMap<String, Object> argsFormat = null;
		argsFormat = (HashMap<String, Object>) conditionMap.get("args");
		if (type.charAt(0) == '$') {
			try {
				Class<Condition> conditionClass = (Class<Condition>) Class.forName(type.substring(1));
				condition = conditionClass.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} else {
			if (type.equals("WeatherCondition")) {
				condition = new WeatherCondition();
			} else if (type.equals("PlayerHasItemCondition")) {
				condition = new PlayerHasItemCondition();
			}
			condition.setArgsFormat(argsFormat);
		}
		return condition;
	}

	/**
	 * 得到结果集合
	 * 
	 * @param 未处理的结果集合
	 * @return 结果集合
	 * @date 创建时间：2018年7月18日 下午5:48:18
	 */
	@SuppressWarnings("unchecked")
	public static HashMap<String, Result> readResults(List<HashMap<String, Object>> resultList) {
		HashMap<String, Result> map = new HashMap<>();
		for (HashMap<String, Object> hashMap : resultList) {
			map.put((String) hashMap.get("name"), readResult((HashMap<String, Object>) hashMap.get("result")));
		}
		return map;
	}

	/**
	 * 得到结果对象
	 * 
	 * @param 未处理的结果
	 * @return 结果对象
	 * @date 创建时间：2018年7月18日 下午3:25:20
	 */
	@SuppressWarnings("unchecked")
	public static Result readResult(HashMap<String, Object> resultMap) {
		Result result = null;
		String type = (String) resultMap.get("type");
		HashMap<String, Object> argsFormat = null;
		HashMap<String, Condition> conditions;
		HashMap<String, Result> nextResult;
		HashMap<String, Result> elseResult;
		argsFormat = (HashMap<String, Object>) resultMap.get("args");
		if (type.charAt(0) == '$') {
			try {
				Class<Result> resultClass = (Class<Result>) Class.forName(type.substring(1));
				result = resultClass.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} else {
			if (type.equals("CraftItem")) {
				result = new CraftItem();
			}
			result.setArgsFormat(argsFormat);
		}
		if (resultMap.containsKey("conditions")) {
			conditions = readConditions((List<HashMap<String, Object>>) resultMap.get("conditions"));
			result.setConditions(conditions);
		}
		if (resultMap.containsKey("next")) {
			nextResult = readResults((List<HashMap<String, Object>>) resultMap.get("next"));
			result.setNextResult(nextResult);
		}
		if (resultMap.containsKey("else")) {
			elseResult = readResults((List<HashMap<String, Object>>) resultMap.get("else"));
			result.setElseResult(elseResult);
		}
		return result;
	}

	/**
	 * 读取参数格式
	 * 
	 * @param 未处理参数格式
	 * @return 参数格式
	 * @date 创建时间：2018年7月19日 下午1:00:27
	 */
	public static HashMap<String, Object> getArgFormat(HashMap<String, Object> argFormat) {

		return null;

	}
}
