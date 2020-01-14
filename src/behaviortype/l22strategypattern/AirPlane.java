package behaviortype.l22strategypattern;

public class AirPlane implements PlaneType {

	@Override
	public void fly() {
		System.out.println("客机亚音速长距离起飞!");
	}

}
