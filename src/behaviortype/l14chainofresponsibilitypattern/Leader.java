package behaviortype.l14chainofresponsibilitypattern;

public class Leader  extends RequestHandler {

	Leader(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if( days >= 10 && days < 30){
			System.out.println(this.name+"说："+days +"天我批了！");
		}else{
			System.out.println(this.name+"说：我的权利不够大，批不了！");
			System.out.println("开会讨论一下");
			this.nextHandler.handlerRequest(days);
		}
	}

}
