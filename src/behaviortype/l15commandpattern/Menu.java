package behaviortype.l15commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<MenuItem> listItem = new ArrayList<>();
	
	public void addMenuItem(MenuItem menuItem){
		this.listItem.add(menuItem);
	}
}
