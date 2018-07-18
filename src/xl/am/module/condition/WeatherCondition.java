/**
 * 
 */
package xl.am.module.condition;

import java.util.HashMap;

import org.bukkit.WeatherType;
import org.bukkit.entity.Player;

/**
 * 判断是否符合天气<br>
 * <br>
 * 参数范例<br>
 * <br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"args":{"player":"$player","weather":"CLEAR"}<br>
 * <br>
 * <table border="1">
 * <tr>
 * <td>可改的参数</td>
 * <td>可供选择的值</td>
 * </tr>
 * <tr>
 * <td>weather</td>
 * <td>CLEAR，DOWNFALL</td>
 * </tr>
 * </table>
 * 
 * @author 玄凉
 * @date 创建时间：2018年7月18日 下午1:36:50
 * @version 1.0
 */
public class WeatherCondition extends Condition {

	/**
	 * @see xl.am.module.condition.Condition#isMatchCondition()
	 * @date 创建时间：2018年7月18日 下午1:36:50
	 */
	@Override
	public boolean isMatchCondition(HashMap<String, Object> args) {
		if (args.containsKey("player")) {
			Player p = (Player) args.get("player");
			if (WeatherType.valueOf((String) args.get("weather")) == p.getPlayerWeather()) {
				return true;
			}
		}
		return false;
	}

}
