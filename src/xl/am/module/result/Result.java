/**
 * 
 */
package xl.am.module.result;

import java.util.HashMap;

import xl.am.module.condition.Condition;

/**
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午9:05:37
 * @version 1.0
 */
public abstract class Result {
	/**
	 * 参数格式
	 */
	private HashMap<String, Object> argsFormat;
	/**
	 * 条件集
	 */
	private HashMap<String, Condition> conditions;
	/**
	 * 成功结果集
	 */
	private HashMap<String, Result> nextResult;
	/**
	 * 失败结果集
	 */
	private HashMap<String, Result> elseResult;

	/**
	 * 执行result
	 * 
	 * @param 参数
	 * @param 事件中的值
	 * @return 返回执行是否成功（决定接下来执行的是配置文件中的next还是else）
	 * @date 创建时间：2018年7月18日 下午3:35:03
	 */
	public abstract boolean act(HashMap<String, Object> args, HashMap<String, Object> values);

	/**
	 *
	 * 返回参数格式
	 *
	 * @return 参数格式
	 * @date 创建时间：2018年7月18日 下午3:36:38
	 */
	public HashMap<String, Object> getArgsFormat() {
		return argsFormat;
	}

	/**
	 *
	 * 设置参数格式
	 *
	 * @param 要设置的参数格式
	 * @date 创建时间：2018年7月18日 下午3:36:38
	 */
	public void setArgsFormat(HashMap<String, Object> argsFormat) {
		this.argsFormat = argsFormat;
	}

	/**
	 *
	 * 返回条件集
	 *
	 * @return 条件集
	 * @date 创建时间：2018年7月18日 下午5:42:21
	 */
	public HashMap<String, Condition> getConditions() {
		return conditions;
	}

	/**
	 *
	 * 设置条件集
	 *
	 * @param 要设置的条件集
	 * @date 创建时间：2018年7月18日 下午5:42:21
	 */
	public void setConditions(HashMap<String, Condition> conditions) {
		this.conditions = conditions;
	}

	/**
	 *
	 * 返回成功结果集
	 *
	 * @return 成功结果集
	 * @date 创建时间：2018年7月18日 下午5:42:21
	 */
	public HashMap<String, Result> getNextResult() {
		return nextResult;
	}

	/**
	 *
	 * 设置成功结果集
	 *
	 * @param 要设置的成功结果集
	 * @date 创建时间：2018年7月18日 下午5:42:21
	 */
	public void setNextResult(HashMap<String, Result> nextResult) {
		this.nextResult = nextResult;
	}

	/**
	 *
	 * 返回失败结果集
	 *
	 * @return 失败结果集
	 * @date 创建时间：2018年7月18日 下午5:42:21
	 */
	public HashMap<String, Result> getElseResult() {
		return elseResult;
	}

	/**
	 *
	 * 设置失败结果集
	 *
	 * @param 要设置的失败结果集
	 * @date 创建时间：2018年7月18日 下午5:42:21
	 */
	public void setElseResult(HashMap<String, Result> elseResult) {
		this.elseResult = elseResult;
	}

}
