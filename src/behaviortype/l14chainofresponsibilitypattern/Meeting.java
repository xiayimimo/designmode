package behaviortype.l14chainofresponsibilitypattern;

public class Meeting  extends RequestHandler {

	Meeting(String name) {
		super(name);
	}

	@Override
	void handlerRequest(int days) {
		if( days >= 30 ){
			System.out.println("���о�������"+days +"��̫���ˣ���˾�벻���㣬��ٲ�����");
		}
	}

}
