/**
 * ���ģʽ:͸�����ģʽ����ȫ���ģʽ
 * Sunny�����˾������һ������ؼ��⣬����ؼ���Ϊ�����࣬
 * һ���ǵ�Ԫ�ؼ������簴 ť���ı���ȣ�һ���������ؼ������細�塢�м����ȣ��������ģʽ��Ƹý���� ����
 * 
 */
/**
 * @author ¬��
 *
 */
package constructiontype.l9compositepattern;

public class CompositePatternTest{
	public static void main(String[] args) {
		UIControl b1,b2,b3,i1,i2,i3,i4,i5;
		Container panel,window,page;
		b1=new Button();
		b2=new Button();
		b3=new Button();
		i1=new Input();
		i2=new Input();
		i3=new Input();
		i4=new Input();
		i5=new Input();
		panel = new Container();
		window = new Container();
		page = new Container(); 
		panel.add(b1);
		panel.add(i1);
		panel.add(i2);
		window.add(b2);
		window.add(b3);
		window.add(i3);
		window.add(i4);
		window.add(i5);
		page.add(panel);
		page.add(window);
		System.out.println("ҳ������Ŀؼ���"+page.getUI());
	}
	
}