package behaviortype.l23templatemethodpattern;

public class WesternFood extends AbstractTreat {

	@Override
	void eat() {
		System.out.println("³ÔÎ÷²Í");
	}

	@Override
	boolean isRun() {
		return false;
	}
}
