package behaviortype.l24visitorpattern;

/**
 * ���������
 * @author ll
 *
 */
public abstract class AbstractAwardCheck {

	abstract void visit(Student student);
	abstract void visit(Teacher teacher);
}
