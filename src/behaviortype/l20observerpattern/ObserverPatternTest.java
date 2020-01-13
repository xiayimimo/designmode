/**
 * 观察者模式
 * 
 * 
 * Sunny软件公司欲开发一款实时在线股票软件，该软件需提供如下功能：
 * 当股票购买者所 购买的某支股票价格变化幅度达到5%时，系统将自动发送通知（包括新价格）给购买该 股票的所有股民。试使用观察者模式设计并实现该系统
 */
/**
 * @author ll
 *
 */
package behaviortype.l20observerpattern;

public class ObserverPatternTest{
	
	public static void main(String[] args) {
		Observer o1,o2,o3;
		Observable ob;
		o1 = new ConcreteObserver("张三");
		o2 = new ConcreteObserver("李四");
		o3 = new ConcreteObserver("王二麻");
		ob = new ConcreteObservable("美股小分队",15);
		ob.join(o1);
		ob.join(o2);
		ob.join(o3);
		ob.setPrice(9);
		ob.notifyObserver();
		ob.quit(o2);
		ob.setPrice(2);
		ob.notifyObserver();
		ob.quit(o1);
	}
}