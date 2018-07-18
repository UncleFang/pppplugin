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
 * �ж�����Ƿ�ӵ��ĳһ��Ʒ<br>
 * <br>
 * ��������<br>
 * <br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; "args": { "player": "$player", "items": [{
 * "item": { "material": "DIAMOND_SWORD", "meta": { "lores": [{ "lore": "����" }]
 * } } }, { "item": "$example" }] }<br>
 * <br>
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��18�� ����3:38:47
 * @version 1.0
 */
public class PlayerHasItemCondition extends Condition {

	/**
	 * @see xl.am.module.condition.Condition#isMatchCondition(java.util.HashMap)
	 * @date ����ʱ�䣺2018��7��18�� ����3:38:47
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
