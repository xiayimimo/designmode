package createtype.l4singletonpattern;

//������ʱ
public class Hunger {

	private static final Hunger Hunger= new Hunger();
	private Hunger(){}
	
	public static Hunger getInstance(){
		return Hunger;
	}
}
