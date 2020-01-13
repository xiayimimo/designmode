/**
 * 中介者模式
 * 
 * Sunny软件公司欲开发一套图形界面类库。
 * 该类库需要包含若干预定义的窗格(Pane)对象，例 如TextPane、ListPane、GraphicPane等，窗格之间不允许直接引用。
 * 基于该类库的应用由一个 包含一组窗格的窗口(Window)组成，窗口需要协调窗格之间的行为。试采用中介者模式设计 该系统。
 */
/**
 * @author 卢亮
 *
 */
package behaviortype.l18mediatorpattern;

public class MediatorPatternTest{
	
	public static void main(String[] args) {
		AbstractPanel listPane,graphicPanel,textPane;
		MediatorImpl mediator = new MediatorImpl();
		listPane = new ListPane();
		graphicPanel = new GraphicPanel();
		textPane = new TextPane();
		listPane.setMediator(mediator);
		graphicPanel.setMediator(mediator);
		textPane.setMediator(mediator);
		mediator.graphicPanel = graphicPanel;
		mediator.listPane = listPane;
		mediator.textPane = textPane;
		//列表改变引发位置与文本对应更新
		listPane.changed();
		System.out.println("--------------");
		graphicPanel.changed();
		System.out.println("--------------");
		textPane.changed();
	}
	
}