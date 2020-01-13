package behaviortype.l19mementopattern;

import java.util.ArrayList;

/**
 * ������
 * 
 * @author ll
 *
 */
public class Caretaker {
	// ����һ���������洢�������¼
	private ArrayList<Memento> list = new ArrayList<>();

	public Memento getMemento(int i) {
		return (Memento) list.get(i);
	}

	public void setMemento(Memento memento) {
		list.add(memento);
	}

}
