package behaviortype.l17iteratorpattern;

import java.util.List;

public class PageList<E> extends AbstractList<E> {

	public PageList(List<Object> objects) {
		super(objects);
	}

	@Override
	public Iterator createIterator() {
		return new PageIterator(this.objects);
	}
	int size(){
		return objects.size();
	}
	Person get(int i){
		return (Person) objects.get(i);
	}
}
