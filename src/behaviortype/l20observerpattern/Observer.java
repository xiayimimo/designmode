package behaviortype.l20observerpattern;


/**
 * 抽象观察者- 股民
 * @author ll
 *
 */
public interface Observer{
	String getName();
	void setName(String name);
	void update(Observable o, Object arg);
}
