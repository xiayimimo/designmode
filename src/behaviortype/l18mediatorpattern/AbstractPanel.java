package behaviortype.l18mediatorpattern;

public abstract class AbstractPanel {

	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	//ת������ 
	public void changed() { 
		mediator.panelChanged(this); 
		}
	public abstract void update();
}
