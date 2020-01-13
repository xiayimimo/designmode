package behaviortype.l17iteratorpattern;

import java.util.List;

public abstract class Iterator {
	
	//移至下一个元素
	public abstract void next(); 
	//判断是否为最后一个元素
	public abstract boolean isLast(); 
	//移至上一个元素 
	public abstract void previous(); 
	//判断是否为第一个元素
	public abstract boolean isFirst(); 
	//获取下一个元素
	public abstract Object getNextItem(); 
	//获取上一个元素
	public abstract Object getPreviousItem(); 
	public abstract List<Object> getThree();
	
}
