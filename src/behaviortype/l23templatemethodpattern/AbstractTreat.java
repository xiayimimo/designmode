package behaviortype.l23templatemethodpattern;

public abstract class AbstractTreat {
	void treat(){
		System.out.println("�㵥");
		eat();
		if(isRun()){
			System.out.println("��");
		}else{
			System.out.println("��������");
		}
		
	}
	abstract void eat();
	boolean isRun(){ return true;}
}
