package behaviortype.l22strategypattern;

public class Airport {

	private PlaneType planeType;

	public void setPlaneType(PlaneType planeType) {
		this.planeType = planeType;
	}
	
	public void fly(){
		planeType.fly();
	}
	
}
