package behaviortype.l21statepattern;

/**
 * 环境类
 * @author 卢亮
 *
 */
public class Context {

	private RoleState roleState = new OneLevel();

	private int grade;
	
	public void setRoleState(RoleState roleState) {
		this.roleState = roleState;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Context(int grade) {
		super();
		this.grade = grade;
		System.out.println("角色创建成功,当前积分："+this.grade);
	}
	
	public void play(){
		this.roleState.play(this);
	}
	public int success(){
		this.grade += 25;
		checkState();
		System.out.println("过关成功，当前积分："+ this.grade);
		return this.grade > 100 ? 100 : this.grade;
	}
	public int failure(){
		this.grade -= 25;
		System.out.println("过关失败，当前积分："+ this.grade);
		checkState();
		return this.grade < 0 ? 0 : this.grade;
	}
	
	public void checkState(){
		if(this.grade >= 75){
			setRoleState(new FourLevel());
		}else if(this.grade >= 50){
			setRoleState(new ThreeLevel());
		}else if(this.grade >= 25){
			setRoleState(new TwoLevel());
		}else if(this.grade >= 0){
			setRoleState(new OneLevel());
		}
	}
}
