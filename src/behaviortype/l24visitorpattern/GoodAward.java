package behaviortype.l24visitorpattern;

/**
 * ���㽱
 * @author ll
 *
 */
public class GoodAward extends AbstractAwardCheck {

	@Override
	void visit(Student student) {
		if(student.getGrade() >= 90){
			System.out.println("��ѧ��������㽱��");
		}
	}

	@Override
	void visit(Teacher teacher) {
		if(teacher.getGrade() >= 90){
			System.out.println("����ʦ��������㽱��");
		}
	}

}
