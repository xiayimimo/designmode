package behaviortype.l19mementopattern;

/**
 * ��Ϸ״̬ ԭ����
 * @author ll
 *
 */
public class RPGGameState {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	//����״̬
	public Memento save() { 
		return new Memento(this.state); 
		}
	//�ָ�״̬ 
	public void restore(Memento memento) { 
		this.state = memento.getState(); 
		}
	
}
