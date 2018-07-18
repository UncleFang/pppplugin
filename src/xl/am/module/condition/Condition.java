/**
 * 
 */
package xl.am.module.condition;

import java.util.HashMap;

/**
 * 条件的抽象类
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午8:29:54
 * @version 1.0
 */
public abstract class Condition {
	/**
	 * 参数格式
	 */
	private HashMap<String, Object> argsFormat;

	/**
	 * 通过参数返回是否符合条件
	 * 
	 * @param 参数
	 * @return 是否符合条件
	 * @date 创建时间：2018年7月18日 下午2:18:39
	 */
	public abstract boolean isMatchCondition(HashMap<String, Object> args);

	/**
	 *
	 * 返回参数格式
	 *
	 * @return 参数格式
	 * @date 创建时间：2018年7月18日 下午2:19:49
	 */
	public HashMap<String, Object> getArgsFormat() {
		return argsFormat;
	}

	/**
	 *
	 * 设置参数格式
	 *
	 * @param 要设置的参数格式
	 * @date 创建时间：2018年7月18日 下午2:19:49
	 */
	public void setArgsFormat(HashMap<String, Object> argsFormat) {
		this.argsFormat = argsFormat;
	}

}
