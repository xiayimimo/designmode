/**
 * 迭代器模式
 * 
 * 设计一个逐页迭代器，每次可返回指定个数（一页）元素，并将该迭代器用于对数据进行分页处理。
 */
/**
 * @author 卢亮
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
		list.add(new Person("1号",1));
		list.add(new Person("2号",2));
		list.add(new Person("3号",3));
		list.add(new Person("4号",4));
		list.add(new Person("5号",5));
		list.add(new Person("6号",6));
		list.add(new Person("7号",7));
		list.add(new Person("8号",8));
		list.add(new Person("9号",9));
		list.add(new Person("10号",10));
		list.add(new Person("9号",9));
		list.add(new Person("10号",10));
		list.add(new Person("7号",7));
		list.add(new Person("8号",8));
		list.add(new Person("9号",9));
		list.add(new Person("10号",10));
		list.add(new Person("9号",9));
		list.add(new Person("10号",10));
		while(!pageIterator.isLast()){
			System.out.println(pageIterator.getThree());
			pageIterator.previous();
			pageIterator.next();
		}
	}
}