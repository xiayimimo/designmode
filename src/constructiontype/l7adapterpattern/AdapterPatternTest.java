/**
 * ������ģʽ
 *  ����������
 *  ����������ʹ���� �ܵ��̳�  finalӰ�죩
 *  Sunny�����˾OAϵͳ��Ҫ�ṩһ������ģ�飬���û�������Ϣ����������ȣ��� ��֮���ٴ洢�����ݿ��У�ϵͳ�Ѿ�����������ݿ�����ࡣ
 *  Ϊ����߿���Ч�ʣ����� Ҫ�������еļ����㷨����Щ�㷨��װ��һЩ�ɵ������ṩ�����У���Щ����û��Դ�� �롣
 *  ��ʹ��������ģʽ��Ƹü���ģ�飬ʵ���ڲ��޸�������Ļ��������õ��������� ������
 */
/**
 * @author ¬��
 *
 */
package constructiontype.l7adapterpattern;

public class AdapterPatternTest{
	
	public static void main(String[] args) {
		//EncryptionAdapter���������ļ�����
		EncryptionOperation encryptionOperation = new EncryptionClassAdapter();
		System.out.println(encryptionOperation.MD5("niya"));
		
	}
}