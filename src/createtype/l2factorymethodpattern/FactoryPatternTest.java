/**
 * ��������ģʽ����������չ������������չ��ɶԳ���
 */
/**
 * @author ¬��
 *
 */
package createtype.l2factorymethodpattern;

public class FactoryPatternTest{
	
	public static void main(String[] args) {
		SoftwareFactory factory; 
		Operation operation; 
		//�����������ļ�ʵ��
		factory = new SymbianSystemFactory(); 
		operation = factory.operationController(); 
		operation.operation();
	}
	
	
}