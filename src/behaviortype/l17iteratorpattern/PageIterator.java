package behaviortype.l17iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class PageIterator extends Iterator {
	
	private List<Object> list = new ArrayList<Object>(); 
	
	private List<Object> pageList; 
	private int cursor1; 
	//����һ���α꣬���ڼ�¼���������λ�� 
	public PageIterator(List<Object> objects) {
		this.pageList = objects; 
		//��ȡ���϶��� 
		cursor1 = 0; 
		//������������α�ĳ�ʼֵ 
		}
	
	@Override
	public void next() {
		//ÿ�α�������
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
