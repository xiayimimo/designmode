package behaviortype.l20observerpattern;
/**
 * ����۲���-����
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
		System.out.println(this.name+"���յ����Ѳݵ���"+arg+"���ˣ�");
	}

}
