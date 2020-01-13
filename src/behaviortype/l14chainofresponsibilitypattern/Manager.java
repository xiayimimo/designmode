package behaviortype.l14chainofresponsibilitypattern;

public class Manager  extends RequestHandler {

	Manager(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if( days >= 3 && days < 10){
			System.out.println(this.name+"˵��"+days +"�������ˣ�");
		}else{
			System.out.println("����˵���ҵ�Ȩ�������������ˣ�");
			System.out.println("�ϱ�"+this.nextHandler.name);
			this.nextHandler.handlerRequest(days);
		}
	}

}
