/**
 * 
 */
package xl.am.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * ���ڴ���������ļ��м��صĲ�����ʽ
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��17�� ����10:19:58
 * @version 1.0
 */
public class ArgFormatManager {
	/**
	 * �������ļ��м��صĲ�����ʽ
	 */
	private HashMap<String, Map<String, Object>> argFormats;

	/**
	 *
	 * ����argFormats
	 *
	 * @return argFormats
	 * @date ����ʱ�䣺2018��7��17�� ����10:22:20
	 */
	public HashMap<String, Map<String, Object>> getArgFormats() {
		return argFormats;
	}

	/**
	 *
	 * ����argFormats
	 *
	 * @param Ҫ���õ�argFormats
	 * @date ����ʱ�䣺2018��7��17�� ����10:22:20
	 */
	public void setArgFormats(HashMap<String, Map<String, Object>> argFormats) {
		this.argFormats = argFormats;
	}

	/**
	 * @param argFormats
	 * @date ����ʱ�䣺2018��7��17�� ����10:22:32
	 */
	public ArgFormatManager(HashMap<String, Map<String, Object>> argFormats) {
		super();
		this.argFormats = argFormats;
	}
}
