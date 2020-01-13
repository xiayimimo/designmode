/**
 * 备忘录模式
 * 
 * Sunny软件公司正在开发一款RPG网游，为了给玩家提供更多方便，在游戏过程中可以设 置一个恢复点，用于保存当前的游戏场景，
 * 如果在后续游戏过程中玩家角色“不幸牺牲”， 可以返回到先前保存的场景，从所设恢复点开始重新游戏。试使用备忘录模式设计该功 能。
 */
/**
 * @author 卢亮
 *
 */
package behaviortype.l19mementopattern;

public class MementPatternTest {
	private static int index = -1; // 定义一个索引来记录当前状态所在位置
	private static Caretaker c = new Caretaker();

	public static void main(String[] args) {
		RPGGameState gameState = new RPGGameState();
		gameState.setState("游戏开始状态");
		play(gameState);
		gameState.setState("第一关");
		play(gameState);
		gameState.setState("第二关");
		play(gameState);
		gameState.setState("第三关");
		play(gameState);
		gameState.setState("第四关");
		play(gameState);
		gameState.setState("游戏结束");
		play(gameState);
		undoOne(gameState);
		undoOne(gameState);
		undoOne(gameState);
		undoOne(gameState);
		undoOne(gameState);
	}

	// 通关存档点
	public static void play(RPGGameState gameState) {
		System.out.println("******游戏存档******");
		c.setMemento(gameState.save());
		// 保存备忘录
		index++;
	}

	// 恢复到指定历史存档点
	public static void undo(RPGGameState gameState, int i) {
		System.out.println("******角色死亡******");
		index--;
		gameState.restore(c.getMemento(i - 1));
		// 撤销到上一个备忘录
		System.out.println("已恢复到" + gameState.getState());
	}

	// 恢复到上一个存档点
	public static void undoOne(RPGGameState gameState) {
		System.out.println("******角色死亡,恢复到上一关卡******");
		index--;
		gameState.restore(c.getMemento(index));
		// 撤销到上一个备忘录
		System.out.println("已恢复到" + gameState.getState());
	}
}