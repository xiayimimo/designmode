package behaviortype.l21statepattern;

public class FourLevel implements RoleState {

	@Override
	public void play(Context ctx) {
		System.out.println("骨灰级");
		System.out.println("开启基本功能");
		System.out.println("开启游戏胜利积分加倍功能");
		System.out.println("开启游戏换牌功能");
		System.out.println("开启游戏偷牌功能");
	}

}
