/**
 * 外观模式
 *读取文件 加密后 存储
 */
/**
 * @author ll
 *
 */
package constructiontype.ll11facadepattern;

public class FacadePatternTest{
	
	
	public static void main(String[] args) {
		//引入中间外观类 使读写加密三个子类配合工作
		AbstractEncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.FileEncrypt("start", "ok");
	}
}