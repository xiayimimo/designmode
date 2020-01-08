/**
 * װ��ģʽ ��͸��װ��ģʽ����͸��װ��ģʽ
 * ʹ�ö���֮��Ĺ�����ϵȡ����֮��ļ̳й�ϵ
 * 
 * Sunny�����˾��������һ�����ݼ���ģ�飬���Զ��ַ������м��ܡ�
 * ��򵥵ļ����㷨 ͨ������ĸ������λ��ʵ�֣�ͬʱ���ṩ���Ը��ӵ�����������ܣ����ṩ�˸�Ϊ�߼� ����ģ���ܡ��û���ʹ����򵥵ļ����㷨���ַ������м��ܣ�
 * ������û��������Զ� ����֮��Ľ��ʹ�����������㷨���ж��μ��ܣ���ȻҲ���Խ��е����μ��ܡ���ʹ�� װ��ģʽ��Ƹö��ؼ���ϵͳ��
 */
/**
 * @author ¬��
 *
 */
package constructiontype.ll10decoratorpattern;

public class DecoratorPatternTest{
	
	public static void main(String[] args) {
		DataEncryption dataEncryption = new MD5();
		AbstractDecorator abstractDecorator = new MD5Decorator(dataEncryption);
		abstractDecorator = new SHA1Decorator(abstractDecorator);
		abstractDecorator = new BASE64Decorator(abstractDecorator);
		abstractDecorator = new MD5Decorator(abstractDecorator);
		abstractDecorator.encode("WONIMA");
	}
}