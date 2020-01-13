package behaviortype.l17iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class PageIterator extends Iterator {
	
	private List<Object> list = new ArrayList<Object>(); 
	
	private List<Object> pageList; 
	private int cursor1; 
	//定义一个游标，用于记录正向遍历的位置 
	public PageIterator(List<Object> objects) {
		this.pageList = objects; 
		//获取集合对象 
		cursor1 = 0; 
		//设置正向遍历游标的初始值 
		}
	
	@Override
	public void next() {
		//每次遍历三个
		if(cursor1 < pageList.size()) { 
			for (int i = 0; i < 3; i++) {
				if(cursor1>=pageList.size()){
					return;
				}
				getNextItem();
				cursor1++; 
			}
			}
		if(cursor1>=pageList.size()){
			cursor1 = pageList.size()-1;
		}

	}

	@Override
	public boolean isLast() {
		return (cursor1 == pageList.size() );
	}

	@Override
	public void previous() {
		list = new ArrayList<Object>(); 
	}

	@Override
	public boolean isFirst() {
		return false;
	}

	@Override
	public Object getNextItem() {
		list.add((Person) pageList.get(cursor1));
		return pageList.get(cursor1);
	}

	@Override
	public Object getPreviousItem() {
		return null;
	}
	
	@Override
	public List<Object> getThree(){
		return list;
	}
}
