package createtype.l6builderpattern;

/**
 * ����ģʽ���彨����
 * @author ll
 *
 */
public class SimpleStyle extends AbstractPlayerInterface {

	@Override
	public void buildMenu() {
		elements.setMenu("����˵�");
	}

	@Override
	public void buildPlayerList() {
		elements.setPlayerList("���򲥷��б�");
	}

	@Override
	public void buildMainWindow() {
		elements.setMainWindow("���򴰿�");
	}

	@Override
	public void buildControlBar() {
		elements.setControlBar("���������");
	}

	
}
