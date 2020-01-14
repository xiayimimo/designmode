/**
 * 状态模式
 * 状态切换代码可放环境类或具体状态类  此模式“开闭原则”具有倾斜性
 * 
 * Sunny软件公司欲开发一款纸牌游戏软件，
 * 在该游戏软件中用户角色具有入门级 (Primary)、熟练级(Secondary)、高手级(Professional)和骨灰级(Final)四种等级，
 * 角色的等 级与其积分相对应，游戏胜利将增加积分，失败则扣除积分。入门级具有最基本的游戏 功能play() ，
 * 熟练级增加了游戏胜利积分加倍功能doubleScore()，高手级在熟练级基础上 再增加换牌功能changeCards()，
 * 骨灰级在高手级基础上再增加偷看他人的牌功能 peekCards()。
 */
/**
 * @author ll
 *
 */
package behaviortype.l21statepattern;

public class StatePatternTest{
	
	public static void main(String[] args) {
		Context context = new Context(0);
		context.play();
		context.success();
		context.play();
		context.success();
		context.play();
		context.success();
		context.play();
		context.failure();
		context.play();
		context.failure();
		context.failure();
		context.play();
	}
}