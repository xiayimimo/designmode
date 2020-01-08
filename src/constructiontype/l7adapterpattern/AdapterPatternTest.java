/**
 * 适配器模式
 *  对象适配器
 *  类适配器（使用少 受单继承  final影响）
 *  Sunny软件公司OA系统需要提供一个加密模块，将用户机密信息（如口令、邮箱等）加 密之后再存储在数据库中，系统已经定义好了数据库操作类。
 *  为了提高开发效率，现需 要重用已有的加密算法，这些算法封装在一些由第三方提供的类中，有些甚至没有源代 码。
 *  试使用适配器模式设计该加密模块，实现在不修改现有类的基础上重用第三方加密 方法。
 */
/**
 * @author 卢亮
 *
 */
package constructiontype.l7adapterpattern;

public class AdapterPatternTest{
	
	public static void main(String[] args) {
		//EncryptionAdapter可在配置文件设置
		EncryptionOperation encryptionOperation = new EncryptionClassAdapter();
		System.out.println(encryptionOperation.MD5("niya"));
		
	}
}