package behaviortype.l24visitorpattern;

/**
 * 优秀奖
 * @author ll
 *
 */
public class GoodAward extends AbstractAwardCheck {

	@Override
	void visit(Student student) {
		if(student.getGrade() >= 90){
			System.out.println("该学生获得优秀奖！");
		}
	}

	@Override
	void visit(Teacher teacher) {
		if(teacher.getGrade() >= 90){
			System.out.println("该老师获得了优秀奖！");
		}
	}

}
