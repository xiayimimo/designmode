/**
 * ���󹤳�ģʽ������һ���࣬���ٹ�����ĸ���
 * Sunny�����˾���Ƴ�һ���µ��ֻ���Ϸ�����������ܹ�֧��Symbian��Android�� Windows Mobile�ȶ�������ֻ�����ϵͳƽ̨��
 * ��Բ�ͬ���ֻ�����ϵͳ������Ϸ����� ���˲�ͬ����Ϸ��������(OperationController)�����Ϸ�������(InterfaceController)�࣬
 *  ���ṩ��Ӧ�Ĺ���������װ��Щ��ĳ�ʼ�����̡� ���Ҫ����нϺõ���չ����֧���� �Ĳ���ϵͳƽ̨��Ϊ���������������Բ��ó��󹤳�ģʽ���������ơ�
 */
/**
 * @author ¬��
 *
 */
package createtype.l3abstractfactorypattern;

public class FactoryPatternTest{
	
	public static void main(String[] args) {
		AbstractSoftwareFactory abstractSoftwareFactory = (AbstractSoftwareFactory) XMLUtil.getBean();
		abstractSoftwareFactory.operationController().operation();
		abstractSoftwareFactory.interfaceController().displayInterface();
	}
	
	
}