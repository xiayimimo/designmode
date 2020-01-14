package behaviortype.l24visitorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 对象结构
 * @author ll
 *
 */
public class ObjectStructure {
	private ArrayList<AbstractPerson> list = new ArrayList<AbstractPerson>(); 
	//定义一个集合用于存储元素对象
	@SuppressWarnings("rawtypes")
	public void accept(AbstractAwardCheck visitor) { 
		Iterator i=list.iterator(); 
		while(i.hasNext()) { 
			((AbstractPerson)i.next()).accept(visitor); 
			//遍历访问集合中的每一个元素 
			} 
		}
	public void addElement(AbstractPerson element) { 
		list.add(element);
		}
	public void removeElement(AbstractPerson element) {
		list.remove(element);
	}
	}
