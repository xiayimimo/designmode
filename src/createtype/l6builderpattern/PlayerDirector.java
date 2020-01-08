package createtype.l6builderpattern;

/**
 * ָ����
 * @author ll
 *
 */
public class PlayerDirector {

	
	public PlayerDirector() {
	}

	public Elements construct(AbstractPlayerInterface abstractPlayerInterface){
		abstractPlayerInterface.buildMainWindow();
		abstractPlayerInterface.buildMenu();
		abstractPlayerInterface.buildPlayerList();
		if(abstractPlayerInterface.hook()){
			abstractPlayerInterface.buildControlBar();
		}
		return abstractPlayerInterface.createElements();
	}
	
}
