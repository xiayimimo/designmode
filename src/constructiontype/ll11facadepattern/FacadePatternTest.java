/**
 * ���ģʽ
 *��ȡ�ļ� ���ܺ� �洢
 */
/**
 * @author ll
 *
 */
package constructiontype.ll11facadepattern;

public class FacadePatternTest{
	
	
	public static void main(String[] args) {
		//�����м������ ʹ��д��������������Ϲ���
		AbstractEncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.FileEncrypt("start", "ok");
	}
}