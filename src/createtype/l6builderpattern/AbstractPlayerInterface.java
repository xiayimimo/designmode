package createtype.l6builderpattern;

/**
 * 视频播放器界面组成元素
 * 抽象建造者
 * @author ll
 *
 */
public abstract class AbstractPlayerInterface {

	protected Elements elements = new Elements();
	
	public abstract void buildMenu();
	public abstract void buildPlayerList();
	public abstract void buildMainWindow();
	public abstract void buildControlBar();
	
	protected Elements createElements(){
		return elements;
	}
	
	
	@Override
	public String toString() {
		return "AbstractPlayerInterface [elements=" + elements + "]";
	}
	public boolean hook() { 
		return false; 
	}
}
