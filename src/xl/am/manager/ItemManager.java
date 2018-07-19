/**
 * 
 */
package xl.am.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

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

	/**
	 * 
	 * @see java.util.HashMap#clear()
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public void clear() {
		items.clear();
	}

	/**
	 * @param key
	 * @return
	 * @see java.util.HashMap#containsKey(java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public boolean containsKey(Object key) {
		return items.containsKey(key);
	}

	/**
	 * @param key
	 * @return
	 * @see java.util.HashMap#get(java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public ItemStack get(Object key) {
		return items.get(key);
	}

	/**
	 * @return
	 * @see java.util.HashMap#isEmpty()
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public boolean isEmpty() {
		return items.isEmpty();
	}

	/**
	 * @return
	 * @see java.util.HashMap#keySet()
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public Set<String> keySet() {
		return items.keySet();
	}

	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public ItemStack put(String key, ItemStack value) {
		return items.put(key, value);
	}

	/**
	 * @param m
	 * @see java.util.HashMap#putAll(java.util.Map)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public void putAll(Map<? extends String, ? extends ItemStack> m) {
		items.putAll(m);
	}

	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.HashMap#remove(java.lang.Object, java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public boolean remove(Object key, Object value) {
		return items.remove(key, value);
	}

	/**
	 * @param key
	 * @return
	 * @see java.util.HashMap#remove(java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public ItemStack remove(Object key) {
		return items.remove(key);
	}

	/**
	 * @param key
	 * @param oldValue
	 * @param newValue
	 * @return
	 * @see java.util.HashMap#replace(java.lang.Object, java.lang.Object, java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public boolean replace(String key, ItemStack oldValue, ItemStack newValue) {
		return items.replace(key, oldValue, newValue);
	}

	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.HashMap#replace(java.lang.Object, java.lang.Object)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public ItemStack replace(String key, ItemStack value) {
		return items.replace(key, value);
	}

	/**
	 * @param function
	 * @see java.util.HashMap#replaceAll(java.util.function.BiFunction)
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public void replaceAll(BiFunction<? super String, ? super ItemStack, ? extends ItemStack> function) {
		items.replaceAll(function);
	}

	/**
	 * @return
	 * @see java.util.HashMap#size()
	 * @date 创建时间：2018年7月19日 下午12:57:28 
	 */
	public int size() {
		return items.size();
	}
}
