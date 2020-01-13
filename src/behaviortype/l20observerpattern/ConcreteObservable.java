package behaviortype.l20observerpattern;

/**
 * ����۲�Ŀ���� -�ɼ�
 * @author ll
 *
 */
public class ConcreteObservable extends Observable {

	private int start;
	public ConcreteObservable(String name,int price) {
		System.out.println(name+"�����ˣ����м�"+price);
		this.name = name;
		this.price = price;
		start = price;
	}

	@Override
	public void notifyObserver() {
		if((this.price - start)< -5){
			start = this.price;
			System.out.println(this.name + "����֪ͨ�ɼ��µ�����5%,��ǰ�ɼ�"+this.price);
			for (Observer observer : players) {
				observer.update(this, this.price);
			}
		}
	}

}
