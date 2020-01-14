package behaviortype.l24visitorpattern;

/**
 * ���н�
 * @author ll
 *
 */
public class ResearchAward extends AbstractAwardCheck {

	@Override
	void visit(Student student) {
		if(student.getArticleCount() >= 2){
			System.out.println("��ѧ������˿��н���");
		}
		
	}

	@Override
	void visit(Teacher teacher) {
		if(teacher.getArticleCount() >= 10){
			System.out.println("����ʦ����˿��н���");
		}
	}

}
