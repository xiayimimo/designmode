package createtype.l6builderpattern;

/**
 * ����ģʽ���彨����
 * @author ll
 *
 */
public class ComplateStyle extends AbstractPlayerInterface {

	
	@Override
	public void buildMenu() {
		elements.setMenu("�����˵�");
	}

	@Override
	public void buildPlayerList() {
		elements.setPlayerList("���������б�");
	}

	@Override
	public void buildMainWindow() {
		elements.setMainWindow("��������");
	}

	@Override
	public void buildControlBar() {
		elements.setControlBar("����������");
	}

	@Override
	public boolean hook() {
		return true;
	}
}
