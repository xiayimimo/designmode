package behaviortype.l14chainofresponsibilitypattern;

public class Meeting  extends RequestHandler {

	Meeting(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if( days >= 30 ){
			System.out.println("经研究决定："+days +"天太长了，公司离不开你，这假不批！");
		}
	}

}
