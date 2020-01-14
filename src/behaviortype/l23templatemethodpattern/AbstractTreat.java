package behaviortype.l23templatemethodpattern;

public abstract class AbstractTreat {
	void treat(){
		System.out.println("点单");
		eat();
		if(isRun()){
			System.out.println("买单");
		}else{
			System.out.println("不买单逃跑");
		}
		
	}
	abstract void eat();
	boolean isRun(){ return true;}
}
