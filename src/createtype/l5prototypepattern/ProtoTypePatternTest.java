/**
 * 原型模式
 * 设计并实现一个客户类Customer，其中包含一个名为客户地址的成员变量，客户地址的类 型为Address，
 * 用浅克隆和深克隆分别实现Customer对象的复制并比较这两种克隆方式的 异同。
 */
/**
 * @author ll
 *
 */
package createtype.l5prototypepattern;

public class ProtoTypePatternTest {
	public static void main(String args[]) {
		ProtoType log_previous = new ProtoType();
		// 创建原型对象
		log_previous.setName("张无忌");
		log_previous.setDate("第12周");
		log_previous.setContent("这周工作很忙，每天加班！");
		System.out.println("****周报****");
		System.out.println("周次：" + log_previous.getDate());
		System.out.println("姓名：" + log_previous.getName());
		System.out.println("内容：" + log_previous.getContent());
		System.out.println("--------------------------------");
		ProtoType log_new;
		log_new = log_previous.clone();
		// 调用克隆方法创建克隆对象
		log_new.setDate("第13周");
		System.out.println("****周报****");
		System.out.println("周次：" + log_new.getDate());
		System.out.println("姓名：" + log_new.getName());
		System.out.println("内容：" + log_new.getContent());
		
		System.out.println(log_previous == log_new); //false
		System.out.println(log_previous.getDate() == log_new.getDate());//false
		System.out.println(log_previous.getName() == log_new.getName()); //true 不可变字符串
		System.out.println(log_previous.getContent() == log_new.getContent());//true 不可变字符串
	}
}
