package createtype.l6builderpattern;

/**
 * 界面包含元素
 * 建造目标
 * @author ll
 *
 */
public class Elements {

	private String menu;
	private String playerList;
	private String mainWindow;
	private String controlBar;
	
	
	public Elements() {
		super();
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPlayerList() {
		return playerList;
	}
	public void setPlayerList(String playerList) {
		this.playerList = playerList;
	}
	public String getMainWindow() {
		return mainWindow;
	}
	public void setMainWindow(String mainWindow) {
		this.mainWindow = mainWindow;
	}
	public String getControlBar() {
		return controlBar;
	}
	public void setControlBar(String controlBar) {
		this.controlBar = controlBar;
	}
	@Override
	public String toString() {
		return "Elements [menu=" + menu + ", playerList=" + playerList + ", mainWindow=" + mainWindow + ", controlBar="
				+ controlBar + "]";
	}
	
	
}
