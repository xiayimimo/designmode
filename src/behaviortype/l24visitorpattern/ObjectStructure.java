package behaviortype.l24visitorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ����ṹ
 * @author ll
 *
 */
public class ObjectStructure {
	private ArrayList<AbstractPerson> list = new ArrayList<AbstractPerson>(); 
	//����һ���������ڴ洢Ԫ�ض���
	@SuppressWarnings("rawtypes")
	public void accept(AbstractAwardCheck visitor) { 
		Iterator i=list.iterator(); 
		while(i.hasNext()) { 
			((AbstractPerson)i.next()).accept(visitor); 
			//�������ʼ����е�ÿһ��Ԫ�� 
			} 
		}
	public void addElement(AbstractPerson element) { 
		list.add(element);
		}
	public void removeElement(AbstractPerson element) {
		list.remove(element);
	}
	}
