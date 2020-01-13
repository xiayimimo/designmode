/**
 * ����ģʽ  ��������������߽���
 * ������С�����������������־�������������������ģʽ��
 * 
 * Sunny�����˾������һ������Windowsƽ̨�Ĺ����ϵͳ��
 * ��ϵͳ�ṩ��һ�����˵� (Menu)�������˵��а�����һЩ�˵���(MenuItem)������ͨ��Menu���addMenuItem()�� �����Ӳ˵��
 * �˵������Ҫ������click()��ÿһ���˵������һ�����������࣬������ �������OpenCommand(������)��CreateCommand(�½�����)��
 * EditCommand(�༭����) �ȣ�
 * ���������һ��execute()���������ڵ��ù����ϵͳ������(BoardScreen)��open()�� create()��edit()�ȷ�����
 * ��ʹ������ģʽ��Ƹ�ϵͳ���Ա㽵��MenuItem����BoardScreen ��֮�����϶�
 */
/**
 * @author ll
 *
 */
package behaviortype.l15commandpattern;

public class CommandPatternTest{
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		MenuItem menuItem = new MenuItem();
		//��ͨ�������ļ�����
		AbstractCommand abstractCommand = new OpenCommand();
		menu.addMenuItem(menuItem);
		menuItem.setAbstractCommand(abstractCommand);
		menuItem.execute();
		abstractCommand = new CreateCommand();
		menuItem.setAbstractCommand(abstractCommand);
		menuItem.execute();
		
	}
}