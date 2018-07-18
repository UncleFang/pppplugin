/**
 * 
 */
package xl.am.module.condition;

import java.util.HashMap;

/**
 * �����ĳ�����
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��17�� ����8:29:54
 * @version 1.0
 */
public abstract class Condition {
	/**
	 * ������ʽ
	 */
	private HashMap<String, Object> argsFormat;

	/**
	 * ͨ�����������Ƿ��������
	 * 
	 * @param ����
	 * @return �Ƿ��������
	 * @date ����ʱ�䣺2018��7��18�� ����2:18:39
	 */
	public abstract boolean isMatchCondition(HashMap<String, Object> args);

	/**
	 *
	 * ���ز�����ʽ
	 *
	 * @return ������ʽ
	 * @date ����ʱ�䣺2018��7��18�� ����2:19:49
	 */
	public HashMap<String, Object> getArgsFormat() {
		return argsFormat;
	}

	/**
	 *
	 * ���ò�����ʽ
	 *
	 * @param Ҫ���õĲ�����ʽ
	 * @date ����ʱ�䣺2018��7��18�� ����2:19:49
	 */
	public void setArgsFormat(HashMap<String, Object> argsFormat) {
		this.argsFormat = argsFormat;
	}

}
