/**
 * ְ����ģʽ  ����ְ����ģʽ ������ְ����ģʽ
 * 
 * 
 * Sunny�����˾��OAϵͳ��Ҫ�ṩһ����������ģ�飺���Ա���������С��3�죬���� ���������ü�����
 * ���Ա������������ڵ���3�죬С��10�죬����������������Ա�� ����������ڵ���10�죬С��30�죬�ܾ������������
 * �������30�죬�ܾ���Ҳ������ ������ʾ��Ӧ�ľܾ���Ϣ������ְ����ģʽ��Ƹü�������ģ�顣
 */
/**
 * @author ¬��
 *
 */
package behaviortype.l14chainofresponsibilitypattern;

public class ChainOfResponsibilityPatternTest{
	
	public static void main(String[] args) {
		RequestHandler director,manager,leader,meeting;
		director = new Director("����");
		manager = new Manager("����");
		leader = new Leader("�ܾ���");
		meeting = new Meeting("����");
		director.setNextHandler(manager);
		manager.setNextHandler(leader);
		leader.setNextHandler(meeting);
		director.handlerRequest(29);
	}
	
	
}