/**
 * 
 */
package xl.am.module.result;

import java.util.HashMap;

import xl.am.module.condition.Condition;

/**
 * @author ����
 * @date ����ʱ�䣺2018��7��17�� ����9:05:37
 * @version 1.0
 */
public abstract class Result {
	/**
	 * ������ʽ
	 */
	private HashMap<String, Object> argsFormat;
	/**
	 * ������
	 */
	private HashMap<String, Condition> conditions;
	/**
	 * �ɹ������
	 */
	private HashMap<String, Result> nextResult;
	/**
	 * ʧ�ܽ����
	 */
	private HashMap<String, Result> elseResult;

	/**
	 * ִ��result
	 * 
	 * @param ����
	 * @param �¼��е�ֵ
	 * @return ����ִ���Ƿ�ɹ�������������ִ�е��������ļ��е�next����else��
	 * @date ����ʱ�䣺2018��7��18�� ����3:35:03
	 */
	public abstract boolean act(HashMap<String, Object> args, HashMap<String, Object> values);

	/**
	 *
	 * ���ز�����ʽ
	 *
	 * @return ������ʽ
	 * @date ����ʱ�䣺2018��7��18�� ����3:36:38
	 */
	public HashMap<String, Object> getArgsFormat() {
		return argsFormat;
	}

	/**
	 *
	 * ���ò�����ʽ
	 *
	 * @param Ҫ���õĲ�����ʽ
	 * @date ����ʱ�䣺2018��7��18�� ����3:36:38
	 */
	public void setArgsFormat(HashMap<String, Object> argsFormat) {
		this.argsFormat = argsFormat;
	}

	/**
	 *
	 * ����������
	 *
	 * @return ������
	 * @date ����ʱ�䣺2018��7��18�� ����5:42:21
	 */
	public HashMap<String, Condition> getConditions() {
		return conditions;
	}

	/**
	 *
	 * ����������
	 *
	 * @param Ҫ���õ�������
	 * @date ����ʱ�䣺2018��7��18�� ����5:42:21
	 */
	public void setConditions(HashMap<String, Condition> conditions) {
		this.conditions = conditions;
	}

	/**
	 *
	 * ���سɹ������
	 *
	 * @return �ɹ������
	 * @date ����ʱ�䣺2018��7��18�� ����5:42:21
	 */
	public HashMap<String, Result> getNextResult() {
		return nextResult;
	}

	/**
	 *
	 * ���óɹ������
	 *
	 * @param Ҫ���õĳɹ������
	 * @date ����ʱ�䣺2018��7��18�� ����5:42:21
	 */
	public void setNextResult(HashMap<String, Result> nextResult) {
		this.nextResult = nextResult;
	}

	/**
	 *
	 * ����ʧ�ܽ����
	 *
	 * @return ʧ�ܽ����
	 * @date ����ʱ�䣺2018��7��18�� ����5:42:21
	 */
	public HashMap<String, Result> getElseResult() {
		return elseResult;
	}

	/**
	 *
	 * ����ʧ�ܽ����
	 *
	 * @param Ҫ���õ�ʧ�ܽ����
	 * @date ����ʱ�䣺2018��7��18�� ����5:42:21
	 */
	public void setElseResult(HashMap<String, Result> elseResult) {
		this.elseResult = elseResult;
	}

}
