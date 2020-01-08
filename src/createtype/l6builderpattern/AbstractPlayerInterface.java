package createtype.l6builderpattern;

/**
 * ��Ƶ�������������Ԫ��
 * ��������
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
