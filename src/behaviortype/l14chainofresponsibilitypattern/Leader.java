package behaviortype.l14chainofresponsibilitypattern;

public class Leader  extends RequestHandler {

	Leader(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if( days >= 10 && days < 30){
			System.out.println(this.name+"˵��"+days +"�������ˣ�");
		}else{
			System.out.println(this.name+"˵���ҵ�Ȩ�������������ˣ�");
			System.out.println("��������һ��");
			this.nextHandler.handlerRequest(days);
		}
	}

}
