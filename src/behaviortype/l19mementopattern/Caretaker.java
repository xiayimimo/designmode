package behaviortype.l19mementopattern;

import java.util.ArrayList;

/**
 * 负责人
 * 
 * @author ll
 *
 */
public class Caretaker {
	// 定义一个集合来存储多个备忘录
	private ArrayList<Memento> list = new ArrayList<>();

	public Memento getMemento(int i) {
		return (Memento) list.get(i);
	}

	public void setMemento(Memento memento) {
		list.add(memento);
	}

}
