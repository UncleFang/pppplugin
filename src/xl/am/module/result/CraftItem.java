/**
 * 
 */
package xl.am.module.result;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * 给予玩家物品<br>
 * <br>
 * 参照范例<br>
 * <br>
 * { "results": [{ "result": { "name": "craft", "type": "CraftItem", "args": {
 * "items": [{ "item": "$example" }] }, "conditions": [{}], "next": [{}],
 * "else": [{}] } } ] }
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月18日 下午3:32:52
 * @version 1.0
 */
public class CraftItem extends Result implements CreateItem {
	/**
	 * @see xl.am.module.result.Result#act(java.util.HashMap)
	 * @date 创建时间：2018年7月18日 下午3:37:02
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean act(HashMap<String, Object> args, HashMap<String, Object> values) {
		List<ItemStack> items = (List<ItemStack>) args.get("items");
		Player player = (Player) args.get("player");
		for (ItemStack itemStack : items) {
			player.getInventory().addItem(itemStack);
		}
		if (values.containsKey("ItemBeCrafted") && values.get("ItemBeCrafted") != null) {
			values.replace("ItemBeCrafted",
					items.addAll((Collection<? extends ItemStack>) values.get("ItemBeCrafted")));
		} else {
			values.put("ItemBeCrafted", items);
		}
		return false;
	}

}
