/**
 * 
 */
package xl.am.module.condition;

import java.util.HashMap;

import org.bukkit.WeatherType;
import org.bukkit.entity.Player;

/**
 * �ж��Ƿ��������<br>
 * <br>
 * ��������<br>
 * <br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"args":{"player":"$player","weather":"CLEAR"}<br>
 * <br>
 * <table border="1">
 * <tr>
 * <td>�ɸĵĲ���</td>
 * <td>�ɹ�ѡ���ֵ</td>
 * </tr>
 * <tr>
 * <td>weather</td>
 * <td>CLEAR��DOWNFALL</td>
 * </tr>
 * </table>
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��18�� ����1:36:50
 * @version 1.0
 */
public class WeatherCondition extends Condition {

	/**
	 * @see xl.am.module.condition.Condition#isMatchCondition()
	 * @date ����ʱ�䣺2018��7��18�� ����1:36:50
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
