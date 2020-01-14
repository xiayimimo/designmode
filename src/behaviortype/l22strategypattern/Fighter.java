package behaviortype.l22strategypattern;

public class Fighter implements PlaneType {

	@Override
	public void fly() {
		System.out.println("歼击机超音速长距离起飞!");
	}

}
