package behaviortype.l20observerpattern;


/**
 * ����۲���- ����
 * @author ll
 *
 */
public interface Observer{
	String getName();
	void setName(String name);
	void update(Observable o, Object arg);
}
