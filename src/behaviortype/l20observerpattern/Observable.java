package behaviortype.l20observerpattern;

import java.util.ArrayList;

/**
 * 抽象观察目标 -股票价格
 * 
 * @author ll
 *
 */
public abstract class Observable {

	protected String name; // 股票名称
	protected int price; // 股票名称
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

	// 注册方法
	public void join(Observer obs) {
		System.out.println(obs.getName() + "加入" + this.name);
		players.add(obs);
	}

	// 注销方法
	public void quit(Observer obs) {
		System.out.println(obs.getName() + "退出" + this.name);
		players.remove(obs);
	}

	// 声明抽象通知方法
	public abstract void notifyObserver();
}
