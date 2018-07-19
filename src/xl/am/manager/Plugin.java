/**
 * 
 */
package xl.am.manager;

import org.bukkit.plugin.java.JavaPlugin;

import xl.am.io.Reader;

/**
 * ������
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��19�� ����12:45:51
 * @version 1.0
 */
public class Plugin extends JavaPlugin {
	private static Plugin instance;
	private ItemManager itemManager;
	private ArgFormatManager argFormatManager;
	private PropManager propManager;

	/**
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 * @date ����ʱ�䣺2018��7��19�� ����12:46:01
	 */
	@Override
	public void onEnable() {
		super.onEnable();
		instance = this;
		itemManager = new ItemManager(Reader.readItems());
		argFormatManager = new ArgFormatManager(Reader.read);
		propManager = new PropManager(Reader.readProp());
	}

	/**
	 * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
	 * @date ����ʱ�䣺2018��7��19�� ����12:46:06
	 */
	@Override
	public void onDisable() {
		// TODO �Զ����ɵķ������
		super.onDisable();
	}

	/**
	 *
	 * ���ز������
	 *
	 * @return �������
	 * @date ����ʱ�䣺2018��7��19�� ����12:53:30
	 */
	public static Plugin getInstance() {
		return instance;
	}

	/**
	 *
	 * ������Ʒ������
	 *
	 * @return ��Ʒ������
	 * @date ����ʱ�䣺2018��7��19�� ����12:53:30
	 */
	public ItemManager getItemManager() {
		return itemManager;
	}

	/**
	 *
	 * ������Ʒ������
	 *
	 * @param Ҫ���õ���Ʒ������
	 * @date ����ʱ�䣺2018��7��19�� ����12:53:30
	 */
	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}

	/**
	 *
	 * ���ز�����ʽ������
	 *
	 * @return ������ʽ������
	 * @date ����ʱ�䣺2018��7��19�� ����12:53:30
	 */
	public ArgFormatManager getArgFormatManager() {
		return argFormatManager;
	}

	/**
	 *
	 * ���ò�����ʽ������
	 *
	 * @param Ҫ���õĲ�����ʽ������
	 * @date ����ʱ�䣺2018��7��19�� ����12:53:30
	 */
	public void setArgFormatManager(ArgFormatManager argFormatManager) {
		this.argFormatManager = argFormatManager;
	}

	/**
	 *
	 * ���ص��߹�����
	 *
	 * @return ���߹�����
	 * @date ����ʱ�䣺2018��7��19�� ����12:58:20
	 */
	public PropManager getPropManager() {
		return propManager;
	}

	/**
	 *
	 * ���õ��߹�����
	 *
	 * @param Ҫ���õĵ��߹�����
	 * @date ����ʱ�䣺2018��7��19�� ����12:58:20
	 */
	public void setPropManager(PropManager propManager) {
		this.propManager = propManager;
	}
}
