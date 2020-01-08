/**
 * 工厂方法模式，不利于扩展，工厂类与扩展类成对出现
 */
/**
 * @author 卢亮
 *
 */
package createtype.l2factorymethodpattern;

public class FactoryPatternTest{
	
	public static void main(String[] args) {
		SoftwareFactory factory; 
		Operation operation; 
		//可引入配置文件实现
		factory = new SymbianSystemFactory(); 
		operation = factory.operationController(); 
		operation.operation();
	}
	
	
}