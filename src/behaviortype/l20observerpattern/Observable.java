package behaviortype.l20observerpattern;

import java.util.ArrayList;

/**
 * ����۲�Ŀ�� -��Ʊ�۸�
 * 
 * @author ll
 *
 */
public abstract class Observable {

	protected String name; // ��Ʊ����
	protected int price; // ��Ʊ����
	protected ArrayList<Observer> players = new ArrayList<Observer>();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// ע�᷽��
	public void join(Observer obs) {
		System.out.println(obs.getName() + "����" + this.name);
		players.add(obs);
	}

	// ע������
	public void quit(Observer obs) {
		System.out.println(obs.getName() + "�˳�" + this.name);
		players.remove(obs);
	}

	// ��������֪ͨ����
	public abstract void notifyObserver();
}
