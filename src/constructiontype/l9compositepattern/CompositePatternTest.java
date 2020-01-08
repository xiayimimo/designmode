/**
 * 组合模式:透明组合模式，安全组合模式
 * Sunny软件公司欲开发一个界面控件库，界面控件分为两大类，
 * 一类是单元控件，例如按 钮、文本框等，一类是容器控件，例如窗体、中间面板等，试用组合模式设计该界面控 件库
 * 
 */
/**
 * @author 卢亮
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
		System.out.println("页面包含的控件："+page.getUI());
	}
	
}