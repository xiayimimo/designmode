/**
 * ������ģʽ
 * 
 * Sunny�����˾������һ����Ƶ���������Ϊ�˸��û�ʹ���ṩ���㣬�ò�������ṩ�� �ֽ�����ʾģʽ��
 * ������ģʽ������ģʽ������ģʽ������ģʽ�ȡ��ڲ�ͬ����ʾģʽ ������������Ԫ���������죬
 * ��������ģʽ�½���ʾ�˵��������б������ڡ����� ���ȣ��ھ���ģʽ��ֻ��ʾ�����ںͿ�������
 * ���ڼ���ģʽ�½���ʾ�����ڡ��������� �ղ��б�ȡ�����ʹ�ý�����ģʽ��Ƹ������
 */
/**
 * @author ll
 *
 */
package createtype.l6builderpattern;

public class BuilderPatternTest{
	
	public static void main(String[] args) {
		PlayerDirector playerDirector = new PlayerDirector();
		AbstractPlayerInterface abstractPlayerInterface = (AbstractPlayerInterface) XMLUtil.getBean();
		playerDirector.construct(abstractPlayerInterface);
		System.out.println(abstractPlayerInterface);
	}
	
	
}