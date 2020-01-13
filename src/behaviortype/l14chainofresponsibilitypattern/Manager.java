package behaviortype.l14chainofresponsibilitypattern;

public class Manager  extends RequestHandler {

	Manager(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if( days >= 3 && days < 10){
			System.out.println(this.name+"说："+days +"天我批了！");
		}else{
			System.out.println("经理说：我的权利不够大，批不了！");
			System.out.println("上报"+this.nextHandler.name);
			this.nextHandler.handlerRequest(days);
		}
	}

}
