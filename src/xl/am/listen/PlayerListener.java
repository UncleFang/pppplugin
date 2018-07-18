/**
 * 
 */
package xl.am.listen;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * 
 * 监听玩家事件
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月17日 下午10:13:32
 * @version 1.0
 */
public class PlayerListener {
	@EventHandler
	public void PlayerRightClick(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_AIR) {

		}
	}
}
