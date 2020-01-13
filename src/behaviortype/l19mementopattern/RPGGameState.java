package behaviortype.l19mementopattern;

/**
 * ÓÎÏ·×´Ì¬ Ô­·¢Æ÷
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
	//±£´æ×´Ì¬
	public Memento save() { 
		return new Memento(this.state); 
		}
	//»Ö¸´×´Ì¬ 
	public void restore(Memento memento) { 
		this.state = memento.getState(); 
		}
	
}
