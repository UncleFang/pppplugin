/**
 * 
 */
package xl.am.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pds.utils.ItemUtil;
import xl.am.io.Reader;

/**
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午9:35:59
 * @version 1.0
 */
public class ArgUtil {
	@SuppressWarnings("unchecked")
	public static HashMap<String, Object> formatArgs(Map<String, Object> argsFormat, HashMap<String, Object> values) {
		HashMap<String, Object> result = new HashMap<>();
		Set<String> keys = argsFormat.keySet();
		for (String string : keys) {
			Object value = result.get(string);
			if (value instanceof Map) {
				if (string.equals("item")) {
					result.put(string, ItemUtil.Map2Item((Map<String, Object>) value));
				} else if (string.equals("condition")) {
					result.put(string, Reader.readCondition((HashMap<String, Object>) value));
				} else if (string.equals("result")) {
					result.put(string, Reader.readResult((HashMap<String, Object>) value));
				} else {
					result.put(string, formatArgs((Map<String, Object>) value, values));
				}
			} else if (value instanceof List) {
				List<Map<String, Object>> childArgsFormat = (List<Map<String, Object>>) value;
				List<Map<String, Object>> childResult = new ArrayList<Map<String, Object>>();
				for (Map<String, Object> map : childArgsFormat) {
					childResult.add(formatArgs(map, values));
				}
				result.put(string, childResult);
			} else if (value instanceof String) {
				String txt = (String) value;
				if (txt.charAt(0) == '$') {
					txt = txt.substring(1);
					Set<String> valueKeys = values.keySet();
					for (String valueKey : valueKeys) {
						if (txt.equals(valueKey)) {
							result.put(string, values.get(valueKey));
						}
					}
				}
			}
		}
		return result;
	}
}
