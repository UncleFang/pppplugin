/**
 * 
 */
package xl.am.manager;

import org.bukkit.plugin.java.JavaPlugin;

import xl.am.io.Reader;

/**
 * 插件入口
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月19日 下午12:45:51
 * @version 1.0
 */
public class Plugin extends JavaPlugin {
	private static Plugin instance;
	private ItemManager itemManager;
	private ArgFormatManager argFormatManager;
	private PropManager propManager;

	/**
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 * @date 创建时间：2018年7月19日 下午12:46:01
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
	 * @date 创建时间：2018年7月19日 下午12:46:06
	 */
	@Override
	public void onDisable() {
		// TODO 自动生成的方法存根
		super.onDisable();
	}

	/**
	 *
	 * 返回插件对象
	 *
	 * @return 插件对象
	 * @date 创建时间：2018年7月19日 下午12:53:30
	 */
	public static Plugin getInstance() {
		return instance;
	}

	/**
	 *
	 * 返回物品管理器
	 *
	 * @return 物品管理器
	 * @date 创建时间：2018年7月19日 下午12:53:30
	 */
	public ItemManager getItemManager() {
		return itemManager;
	}

	/**
	 *
	 * 设置物品管理器
	 *
	 * @param 要设置的物品管理器
	 * @date 创建时间：2018年7月19日 下午12:53:30
	 */
	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}

	/**
	 *
	 * 返回参数格式管理器
	 *
	 * @return 参数格式管理器
	 * @date 创建时间：2018年7月19日 下午12:53:30
	 */
	public ArgFormatManager getArgFormatManager() {
		return argFormatManager;
	}

	/**
	 *
	 * 设置参数格式管理器
	 *
	 * @param 要设置的参数格式管理器
	 * @date 创建时间：2018年7月19日 下午12:53:30
	 */
	public void setArgFormatManager(ArgFormatManager argFormatManager) {
		this.argFormatManager = argFormatManager;
	}

	/**
	 *
	 * 返回道具管理器
	 *
	 * @return 道具管理器
	 * @date 创建时间：2018年7月19日 下午12:58:20
	 */
	public PropManager getPropManager() {
		return propManager;
	}

	/**
	 *
	 * 设置道具管理器
	 *
	 * @param 要设置的道具管理器
	 * @date 创建时间：2018年7月19日 下午12:58:20
	 */
	public void setPropManager(PropManager propManager) {
		this.propManager = propManager;
	}
}
