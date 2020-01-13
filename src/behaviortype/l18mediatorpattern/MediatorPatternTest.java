/**
 * �н���ģʽ
 * 
 * Sunny�����˾������һ��ͼ�ν�����⡣
 * �������Ҫ��������Ԥ����Ĵ���(Pane)������ ��TextPane��ListPane��GraphicPane�ȣ�����֮�䲻����ֱ�����á�
 * ���ڸ�����Ӧ����һ�� ����һ�鴰��Ĵ���(Window)��ɣ�������ҪЭ������֮�����Ϊ���Բ����н���ģʽ��� ��ϵͳ��
 */
/**
 * @author ¬��
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
		//�б�ı�����λ�����ı���Ӧ����
		listPane.changed();
		System.out.println("--------------");
		graphicPanel.changed();
		System.out.println("--------------");
		textPane.changed();
	}
	
}