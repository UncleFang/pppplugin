/**
 * 
 */
package xl.am.manager;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

/**
 * 用于储存从配置文件中加载的物品
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午10:16:47
 * @version 1.0
 */
public class ItemManager {
	/**
	 * 从配置文件中加载的物品
	 */
	private HashMap<String, ItemStack> items;

	/**
	 *
	 * 返回items
	 *
	 * @return items
	 * @date 创建时间：2018年7月17日 下午10:17:50
	 */
	public HashMap<String, ItemStack> getItems() {
		return items;
	}

	/**
	 * 
	 * 设置items
	 *
	 * @param 要设置的items
	 * @date 创建时间：2018年7月17日 下午10:17:50
	 */
	public void setItems(HashMap<String, ItemStack> items) {
		this.items = items;
	}

	/**
	 * @param items
	 * @date 创建时间：2018年7月17日 下午10:18:00
	 */
	public ItemManager(HashMap<String, ItemStack> items) {
		super();
		this.items = items;
	}
}
