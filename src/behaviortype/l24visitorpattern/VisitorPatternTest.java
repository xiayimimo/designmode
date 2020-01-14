/**
 * ������ģʽ     �ԡ�����ԭ�򡱵�֧�־�����б��
 * ������ģʽʹ��
 * 
 * 
 * Sunny�����˾��Ϊĳ��У����һ�׽�������ϵͳ����ϵͳ����ʵ�ֽ�ʦ������ѧ������ ������(Award Check)��
 * �����ʦ��������������10ƪ����ѧ�����ĳ���2ƪ������ѡ���� ���������ʦ��ѧ�����ִ��ڵ���90�ֻ���ѧ��ƽ���ɼ����ڵ���90�ֿ�����ѡ�ɼ��� �㽱��
 * ��ʹ�÷�����ģʽ��Ƹ�ϵͳ�����жϺ�ѡ�˼����еĽ�ʦ��ѧ���Ƿ����ĳ�� ��Ҫ��
 */
/**
 * @author ¬��
 *
 */
package behaviortype.l24visitorpattern;

public class VisitorPatternTest{
	
	public static void main(String[] args) {
		AbstractPerson teacher,student;
		teacher = new Teacher(11,90);
		student = new Student(1,93);
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.addElement(student);
		objectStructure.addElement(teacher);
		AbstractAwardCheck goodAward,researchAward;
		goodAward = new GoodAward();
		researchAward = new ResearchAward();
		//�������ṹ
		/*teacher.accept(researchAward);
		teacher.accept(goodAward);
		student.accept(researchAward);
		student.accept(goodAward);*/
		objectStructure.accept(goodAward);
		objectStructure.accept(researchAward);
	}
}