/**
 * ����¼ģʽ
 * 
 * Sunny�����˾���ڿ���һ��RPG���Σ�Ϊ�˸�����ṩ���෽�㣬����Ϸ�����п����� ��һ���ָ��㣬���ڱ��浱ǰ����Ϸ������
 * ����ں�����Ϸ��������ҽ�ɫ�������������� ���Է��ص���ǰ����ĳ�����������ָ��㿪ʼ������Ϸ����ʹ�ñ���¼ģʽ��Ƹù� �ܡ�
 */
/**
 * @author ¬��
 *
 */
package behaviortype.l19mementopattern;

public class MementPatternTest {
	private static int index = -1; // ����һ����������¼��ǰ״̬����λ��
	private static Caretaker c = new Caretaker();

	public static void main(String[] args) {
		RPGGameState gameState = new RPGGameState();
		gameState.setState("��Ϸ��ʼ״̬");
		play(gameState);
		gameState.setState("��һ��");
		play(gameState);
		gameState.setState("�ڶ���");
		play(gameState);
		gameState.setState("������");
		play(gameState);
		gameState.setState("���Ĺ�");
		play(gameState);
		gameState.setState("��Ϸ����");
		play(gameState);
		undoOne(gameState);
		undoOne(gameState);
		undoOne(gameState);
		undoOne(gameState);
		undoOne(gameState);
	}

	// ͨ�ش浵��
	public static void play(RPGGameState gameState) {
		System.out.println("******��Ϸ�浵******");
		c.setMemento(gameState.save());
		// ���汸��¼
		index++;
	}

	// �ָ���ָ����ʷ�浵��
	public static void undo(RPGGameState gameState, int i) {
		System.out.println("******��ɫ����******");
		index--;
		gameState.restore(c.getMemento(i - 1));
		// ��������һ������¼
		System.out.println("�ѻָ���" + gameState.getState());
	}

	// �ָ�����һ���浵��
	public static void undoOne(RPGGameState gameState) {
		System.out.println("******��ɫ����,�ָ�����һ�ؿ�******");
		index--;
		gameState.restore(c.getMemento(index));
		// ��������һ������¼
		System.out.println("�ѻָ���" + gameState.getState());
	}
}