package constructiontype.l9compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Container extends UIControl {

	private List<UIControl> listUIControl = new ArrayList<>();
	private String container="";
	public void add(UIControl uIControl){
		listUIControl.add(uIControl);
	}
	public void remove(UIControl uIControl){
		listUIControl.remove(uIControl);
	}
	public UIControl getChild(int i){
		return null;
	}
	@Override
	String getUI() {
		for (UIControl uiControl : listUIControl) {
			this.container+=uiControl.getUI();
		}
		return this.container;
	}

}
