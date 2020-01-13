package behaviortype.l14chainofresponsibilitypattern;

public class Director  extends RequestHandler {
	Director(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if(days < 3){
			System.out.println(this.name+"˵��"+days +"�������ˣ�");
		}else{
			System.out.println(this.name+"˵���ҵ�Ȩ�������������ˣ�");
			System.out.println("�ϱ�"+this.nextHandler.name);
			this.nextHandler.handlerRequest(days);
		}
	}

}
