/**
 * ״̬ģʽ
 * ״̬�л�����ɷŻ���������״̬��  ��ģʽ������ԭ�򡱾�����б��
 * 
 * Sunny�����˾������һ��ֽ����Ϸ�����
 * �ڸ���Ϸ������û���ɫ�������ż� (Primary)��������(Secondary)�����ּ�(Professional)�͹ǻҼ�(Final)���ֵȼ���
 * ��ɫ�ĵ� ������������Ӧ����Ϸʤ�������ӻ��֣�ʧ����۳����֡����ż��������������Ϸ ����play() ��
 * ��������������Ϸʤ�����ּӱ�����doubleScore()�����ּ��������������� �����ӻ��ƹ���changeCards()��
 * �ǻҼ��ڸ��ּ�������������͵�����˵��ƹ��� peekCards()��
 */
/**
 * @author ll
 *
 */
package behaviortype.l21statepattern;

public class StatePatternTest{
	
	public static void main(String[] args) {
		Context context = new Context(0);
		context.play();
		context.success();
		context.play();
		context.success();
		context.play();
		context.success();
		context.play();
		context.failure();
		context.play();
		context.failure();
		context.failure();
		context.play();
	}
}