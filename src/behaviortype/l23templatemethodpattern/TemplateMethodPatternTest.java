/**
 *模板方法模式  父类必为抽象类
 *
 *请客吃饭，吃西餐，中餐等 子类反向控制父类
 *
 */
/**
 * @author 卢亮
 *
 */
package behaviortype.l23templatemethodpattern;

public class TemplateMethodPatternTest{
	
	public static void main(String[] args) {
		AbstractTreat treat = new ChineseFood();
		treat.treat();
		System.out.println("------------------");
		treat = new WesternFood();
		treat.treat();
	}
}