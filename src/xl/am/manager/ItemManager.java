/**
 * 
 */
package xl.am.manager;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

/**
 * ���ڴ���������ļ��м��ص���Ʒ
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��17�� ����10:16:47
 * @version 1.0
 */
public class ItemManager {
	/**
	 * �������ļ��м��ص���Ʒ
	 */
	private HashMap<String, ItemStack> items;

	/**
	 *
	 * ����items
	 *
	 * @return items
	 * @date ����ʱ�䣺2018��7��17�� ����10:17:50
	 */
	public HashMap<String, ItemStack> getItems() {
		return items;
	}

	/**
	 * 
	 * ����items
	 *
	 * @param Ҫ���õ�items
	 * @date ����ʱ�䣺2018��7��17�� ����10:17:50
	 */
	public void setItems(HashMap<String, ItemStack> items) {
		this.items = items;
	}

	/**
	 * @param items
	 * @date ����ʱ�䣺2018��7��17�� ����10:18:00
	 */
	public ItemManager(HashMap<String, ItemStack> items) {
		super();
		this.items = items;
	}
}
