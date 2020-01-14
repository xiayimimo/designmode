/**
 * 访问者模式     对“开闭原则”的支持具有倾斜性
 * 配合组合模式使用
 * 
 * 
 * Sunny软件公司欲为某高校开发一套奖励审批系统，该系统可以实现教师奖励和学生奖励 的审批(Award Check)，
 * 如果教师发表论文数超过10篇或者学生论文超过2篇可以评选科研 奖，如果教师教学反馈分大于等于90分或者学生平均成绩大于等于90分可以评选成绩优 秀奖。
 * 试使用访问者模式设计该系统，以判断候选人集合中的教师或学生是否符合某种 获奖要求。
 */
/**
 * @author 卢亮
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
		//引入对象结构
		/*teacher.accept(researchAward);
		teacher.accept(goodAward);
		student.accept(researchAward);
		student.accept(goodAward);*/
		objectStructure.accept(goodAward);
		objectStructure.accept(researchAward);
	}
}