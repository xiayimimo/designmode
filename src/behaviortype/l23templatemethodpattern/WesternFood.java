package behaviortype.l23templatemethodpattern;

public class WesternFood extends AbstractTreat {

	@Override
	void eat() {
		System.out.println("������");
	}

	@Override
	boolean isRun() {
		return false;
	}
}
