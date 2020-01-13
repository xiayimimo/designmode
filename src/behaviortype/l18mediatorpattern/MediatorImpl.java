package behaviortype.l18mediatorpattern;

public class MediatorImpl extends Mediator {

	public AbstractPanel listPane;
	public AbstractPanel graphicPanel;
	public AbstractPanel textPane;
	@Override
	public void panelChanged(AbstractPanel panel) {
		if(panel == listPane){
			graphicPanel.update();
			textPane.update();
		}else if(panel == graphicPanel){
			listPane.update();
			textPane.update();
		}else if(panel == textPane){
			graphicPanel.update();
			listPane.update();
		}
	}

}
