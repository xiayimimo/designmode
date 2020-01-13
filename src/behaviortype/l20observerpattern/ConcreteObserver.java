package behaviortype.l20observerpattern;
/**
 * 具体观察者-股民
 * @author ll
 *
 */
public class ConcreteObserver implements Observer {

	private String name;
	ConcreteObserver(String name){
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(this.name+"已收到！窝草掉到"+arg+"块了！");
	}

}
