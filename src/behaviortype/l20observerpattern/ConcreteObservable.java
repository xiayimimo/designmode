package behaviortype.l20observerpattern;

/**
 * 具体观察目标类 -股价
 * @author ll
 *
 */
public class ConcreteObservable extends Observable {

	private int start;
	public ConcreteObservable(String name,int price) {
		System.out.println(name+"上市了！发行价"+price);
		this.name = name;
		this.price = price;
		start = price;
	}

	@Override
	public void notifyObserver() {
		if((this.price - start)< -5){
			start = this.price;
			System.out.println(this.name + "紧急通知股价下跌超过5%,当前股价"+this.price);
			for (Observer observer : players) {
				observer.update(this, this.price);
			}
		}
	}

}
