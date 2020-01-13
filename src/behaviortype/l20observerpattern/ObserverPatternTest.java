/**
 * �۲���ģʽ
 * 
 * 
 * Sunny�����˾������һ��ʵʱ���߹�Ʊ�������������ṩ���¹��ܣ�
 * ����Ʊ�������� �����ĳ֧��Ʊ�۸�仯���ȴﵽ5%ʱ��ϵͳ���Զ�����֪ͨ�������¼۸񣩸������ ��Ʊ�����й�����ʹ�ù۲���ģʽ��Ʋ�ʵ�ָ�ϵͳ
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
		o1 = new ConcreteObserver("����");
		o2 = new ConcreteObserver("����");
		o3 = new ConcreteObserver("������");
		ob = new ConcreteObservable("����С�ֶ�",15);
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