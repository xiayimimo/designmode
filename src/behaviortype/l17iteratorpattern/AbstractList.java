package behaviortype.l17iteratorpattern;

import java.util.*;

public abstract class AbstractList<E> {

	protected List<Object> objects = new ArrayList<Object>();

	public AbstractList(List<Object> objects) { 
		this.objects = objects; 
		}

	public void addObject(Object obj) {
		this.objects.add(obj);
	}

	public void removeObject(Object obj) {
		this.objects.remove(obj);
	}

	public List<Object> getObjects() {
		return this.objects;
	}

	// 声明创建迭代器对象的抽象工厂方法
	public abstract Iterator createIterator();
}
