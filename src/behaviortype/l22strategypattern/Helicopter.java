package behaviortype.l22strategypattern;

public class Helicopter implements PlaneType {

	@Override
	public void fly() {
		System.out.println("直升机亚音速垂直起飞!");
	}

}
