package createtype.l6builderpattern;

/**
 * 完整模式具体建造者
 * @author ll
 *
 */
public class ComplateStyle extends AbstractPlayerInterface {

	
	@Override
	public void buildMenu() {
		elements.setMenu("完整菜单");
	}

	@Override
	public void buildPlayerList() {
		elements.setPlayerList("完整播放列表");
	}

	@Override
	public void buildMainWindow() {
		elements.setMainWindow("完整窗口");
	}

	@Override
	public void buildControlBar() {
		elements.setControlBar("完整进度条");
	}

	@Override
	public boolean hook() {
		return true;
	}
}
