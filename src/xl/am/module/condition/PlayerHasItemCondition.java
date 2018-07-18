/**
 * 
 */
package xl.am.module.condition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * 判断玩家是否拥有某一物品<br>
 * <br>
 * 参数范例<br>
 * <br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; "args": { "player": "$player", "items": [{
 * "item": { "material": "DIAMOND_SWORD", "meta": { "lores": [{ "lore": "范例" }]
 * } } }, { "item": "$example" }] }<br>
 * <br>
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月18日 下午3:38:47
 * @version 1.0
 */
public class PlayerHasItemCondition extends Condition {

	/**
	 * @see xl.am.module.condition.Condition#isMatchCondition(java.util.HashMap)
	 * @date 创建时间：2018年7月18日 下午3:38:47
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean isMatchCondition(HashMap<String, Object> args) {
		if (args.containsKey("player") && args.containsKey("items")) {
			Player player = (Player) args.get("player");
			Inventory inventory = player.getInventory();
			List<Map<String, ItemStack>> items = (List<Map<String, ItemStack>>) args.get("items");
			for (Map<String, ItemStack> map : items) {
				if (!inventory.contains(map.get("item")))
					return false;
			}
			return true;
		}
		return false;
	}

}
