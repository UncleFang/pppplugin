/**
 * 
 */
package xl.am.module.prop;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import xl.am.module.condition.Condition;
import xl.am.module.result.Result;

/**
 * 道具类，表示一种道具类型（不表示道具）
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月18日 下午2:09:50
 * @version 1.0
 */
public class Prop {
	/**
	 * 条件集
	 */
	private HashMap<String, Condition> conditions;
	/**
	 * 结果集
	 */
	private HashMap<String, Result> results;
	private ItemStack item;

	/**
	 * 构建道具类
	 * 
	 * @param 条件集
	 * @param 结果集
	 * @param 物品
	 * @date 创建时间：2018年7月18日 下午2:23:00
	 */
	public Prop(HashMap<String, Condition> conditions, HashMap<String, Result> results, ItemStack item) {
		super();
		this.conditions = conditions;
		this.results = results;
		this.item = item;
	}

	/**
	 * 构建道具类
	 * 
	 * @date 创建时间：2018年7月18日 下午2:11:27
	 */
	public Prop() {
		super();
	}

	/**
	 *
	 * 返回条件集
	 *
	 * @return 条件集
	 * @date 创建时间：2018年7月18日 下午2:11:33
	 */
	public HashMap<String, Condition> getConditions() {
		return conditions;
	}

	/**
	 *
	 * 设置条件集
	 *
	 * @param 要设置的条件集
	 * @date 创建时间：2018年7月18日 下午2:11:33
	 */
	public void setConditions(HashMap<String, Condition> conditions) {
		this.conditions = conditions;
	}

	/**
	 *
	 * 返回结果集
	 *
	 * @return 结果集
	 * @date 创建时间：2018年7月18日 下午2:11:33
	 */
	public HashMap<String, Result> getResults() {
		return results;
	}

	/**
	 *
	 * 设置结果集
	 *
	 * @param 要设置的结果集
	 * @date 创建时间：2018年7月18日 下午2:11:33
	 */
	public void setResults(HashMap<String, Result> results) {
		this.results = results;
	}

	/**
	 *
	 * 返回物品
	 *
	 * @return 物品
	 * @date 创建时间：2018年7月18日 下午2:23:30
	 */
	public ItemStack getItem() {
		return item;
	}

	/**
	 *
	 * 设置物品
	 *
	 * @param 要设置的物品
	 * @date 创建时间：2018年7月18日 下午2:23:30
	 */
	public void setItem(ItemStack item) {
		this.item = item;
	}

}
