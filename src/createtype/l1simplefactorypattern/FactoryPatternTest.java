/**
 * 简单工厂模式 不利于扩展,不符合开闭原则，扩展需要修改已有类代码
 */
/**
 * @author ll
 *
 */
package createtype.l1simplefactorypattern;

public class FactoryPatternTest{
	public static void main(String[] args) throws Exception {
		SoftwareFactory.getOperation("Android").operation();
		SoftwareFactory.getOperation("nima").operation();
	}
}