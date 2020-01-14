package behaviortype.l24visitorpattern;

/**
 * 抽象被访问元素
 * @author ll
 *
 */
public abstract class AbstractPerson {

	abstract void accept(AbstractAwardCheck awardCheck);
}
