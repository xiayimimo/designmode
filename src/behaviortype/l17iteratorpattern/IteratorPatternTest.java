/**
 * ������ģʽ
 * 
 * ���һ����ҳ��������ÿ�οɷ���ָ��������һҳ��Ԫ�أ������õ��������ڶ����ݽ��з�ҳ����
 */
/**
 * @author ¬��
 *
 */
package behaviortype.l17iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternTest{
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		PageList listPage = new PageList(list);
		Iterator pageIterator= listPage.createIterator();
		list.add(new Person("1��",1));
		list.add(new Person("2��",2));
		list.add(new Person("3��",3));
		list.add(new Person("4��",4));
		list.add(new Person("5��",5));
		list.add(new Person("6��",6));
		list.add(new Person("7��",7));
		list.add(new Person("8��",8));
		list.add(new Person("9��",9));
		list.add(new Person("10��",10));
		list.add(new Person("9��",9));
		list.add(new Person("10��",10));
		list.add(new Person("7��",7));
		list.add(new Person("8��",8));
		list.add(new Person("9��",9));
		list.add(new Person("10��",10));
		list.add(new Person("9��",9));
		list.add(new Person("10��",10));
		while(!pageIterator.isLast()){
			System.out.println(pageIterator.getThree());
			pageIterator.previous();
			pageIterator.next();
		}
	}
}