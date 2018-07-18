/**
 * 
 */
package xl.am.module.prop;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import xl.am.module.condition.Condition;
import xl.am.module.result.Result;

/**
 * �����࣬��ʾһ�ֵ������ͣ�����ʾ���ߣ�
 * 
 * @author ����
 * @date ����ʱ�䣺2018��7��18�� ����2:09:50
 * @version 1.0
 */
public class Prop {
	/**
	 * ������
	 */
	private HashMap<String, Condition> conditions;
	/**
	 * �����
	 */
	private HashMap<String, Result> results;
	private ItemStack item;

	/**
	 * ����������
	 * 
	 * @param ������
	 * @param �����
	 * @param ��Ʒ
	 * @date ����ʱ�䣺2018��7��18�� ����2:23:00
	 */
	public Prop(HashMap<String, Condition> conditions, HashMap<String, Result> results, ItemStack item) {
		super();
		this.conditions = conditions;
		this.results = results;
		this.item = item;
	}

	/**
	 * ����������
	 * 
	 * @date ����ʱ�䣺2018��7��18�� ����2:11:27
	 */
	public Prop() {
		super();
	}

	/**
	 *
	 * ����������
	 *
	 * @return ������
	 * @date ����ʱ�䣺2018��7��18�� ����2:11:33
	 */
	public HashMap<String, Condition> getConditions() {
		return conditions;
	}

	/**
	 *
	 * ����������
	 *
	 * @param Ҫ���õ�������
	 * @date ����ʱ�䣺2018��7��18�� ����2:11:33
	 */
	public void setConditions(HashMap<String, Condition> conditions) {
		this.conditions = conditions;
	}

	/**
	 *
	 * ���ؽ����
	 *
	 * @return �����
	 * @date ����ʱ�䣺2018��7��18�� ����2:11:33
	 */
	public HashMap<String, Result> getResults() {
		return results;
	}

	/**
	 *
	 * ���ý����
	 *
	 * @param Ҫ���õĽ����
	 * @date ����ʱ�䣺2018��7��18�� ����2:11:33
	 */
	public void setResults(HashMap<String, Result> results) {
		this.results = results;
	}

	/**
	 *
	 * ������Ʒ
	 *
	 * @return ��Ʒ
	 * @date ����ʱ�䣺2018��7��18�� ����2:23:30
	 */
	public ItemStack getItem() {
		return item;
	}

	/**
	 *
	 * ������Ʒ
	 *
	 * @param Ҫ���õ���Ʒ
	 * @date ����ʱ�䣺2018��7��18�� ����2:23:30
	 */
	public void setItem(ItemStack item) {
		this.item = item;
	}

}
