package behaviortype.l24visitorpattern;


public class Student extends AbstractPerson {

	private int articleCount;
	private int grade;
	
	
	public Student(int articleCount, int grade) {
		super();
		this.articleCount = articleCount;
		this.grade = grade;
	}


	public int getArticleCount() {
		return articleCount;
	}


	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	void accept(AbstractAwardCheck awardCheck) {
		awardCheck.visit(this);
	}

}
