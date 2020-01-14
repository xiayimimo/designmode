package behaviortype.l21statepattern;

public class OneLevel implements RoleState {

	@Override
	public void play(Context ctx) {
		System.out.println("入门级");
		System.out.println("开启基本功能");
	}


}
