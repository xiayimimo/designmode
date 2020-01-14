package behaviortype.l24visitorpattern;

/**
 * 科研奖
 * @author ll
 *
 */
public class ResearchAward extends AbstractAwardCheck {

	@Override
	void visit(Student student) {
		if(student.getArticleCount() >= 2){
			System.out.println("该学生获得了科研奖！");
		}
		
	}

	@Override
	void visit(Teacher teacher) {
		if(teacher.getArticleCount() >= 10){
			System.out.println("该老师获得了科研奖！");
		}
	}

}
