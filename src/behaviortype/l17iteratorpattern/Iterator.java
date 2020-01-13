package behaviortype.l17iteratorpattern;

import java.util.List;

public abstract class Iterator {
	
	//������һ��Ԫ��
	public abstract void next(); 
	//�ж��Ƿ�Ϊ���һ��Ԫ��
	public abstract boolean isLast(); 
	//������һ��Ԫ�� 
	public abstract void previous(); 
	//�ж��Ƿ�Ϊ��һ��Ԫ��
	public abstract boolean isFirst(); 
	//��ȡ��һ��Ԫ��
	public abstract Object getNextItem(); 
	//��ȡ��һ��Ԫ��
	public abstract Object getPreviousItem(); 
	public abstract List<Object> getThree();
	
}
