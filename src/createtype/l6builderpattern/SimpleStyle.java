package createtype.l6builderpattern;

/**
 * 完整模式具体建造者
 * @author ll
 *
 */
public class SimpleStyle extends AbstractPlayerInterface {

	@Override
	public void buildMenu() {
		elements.setMenu("精简菜单");
	}

	@Override
	public void buildPlayerList() {
		elements.setPlayerList("精简播放列表");
	}

	@Override
	public void buildMainWindow() {
		elements.setMainWindow("精简窗口");
	}

	@Override
	public void buildControlBar() {
		elements.setControlBar("精简进度条");
	}

	
}
