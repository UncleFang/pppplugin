/**
 * 
 */
package xl.am.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于储存从配置文件中加载的参数格式
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午10:19:58
 * @version 1.0
 */
public class ArgFormatManager {
	/**
	 * 从配置文件中加载的参数格式
	 */
	private HashMap<String, Map<String, Object>> argFormats;

	/**
	 *
	 * 返回argFormats
	 *
	 * @return argFormats
	 * @date 创建时间：2018年7月17日 下午10:22:20
	 */
	public HashMap<String, Map<String, Object>> getArgFormats() {
		return argFormats;
	}

	/**
	 *
	 * 设置argFormats
	 *
	 * @param 要设置的argFormats
	 * @date 创建时间：2018年7月17日 下午10:22:20
	 */
	public void setArgFormats(HashMap<String, Map<String, Object>> argFormats) {
		this.argFormats = argFormats;
	}

	/**
	 * @param argFormats
	 * @date 创建时间：2018年7月17日 下午10:22:32
	 */
	public ArgFormatManager(HashMap<String, Map<String, Object>> argFormats) {
		super();
		this.argFormats = argFormats;
	}
}
