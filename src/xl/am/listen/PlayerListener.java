/**
 * 
 */
package xl.am.listen;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * 
 * ��������¼�
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��17�� ����10:13:32
 * @version 1.0
 */
public class PlayerListener {
	@EventHandler
	public void PlayerRightClick(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_AIR) {

		}
	}
}
