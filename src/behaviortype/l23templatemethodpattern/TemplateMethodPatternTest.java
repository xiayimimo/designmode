/**
 *ģ�巽��ģʽ  �����Ϊ������
 *
 *��ͳԷ��������ͣ��в͵� ���෴����Ƹ���
 *
 */
/**
 * @author ¬��
 *
 */
package behaviortype.l23templatemethodpattern;

public class TemplateMethodPatternTest{
	
	public static void main(String[] args) {
		AbstractTreat treat = new ChineseFood();
		treat.treat();
		System.out.println("------------------");
		treat = new WesternFood();
		treat.treat();
	}
}