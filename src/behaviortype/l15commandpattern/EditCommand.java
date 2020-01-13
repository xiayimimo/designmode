package behaviortype.l15commandpattern;

public class EditCommand extends AbstractCommand {

	private BoardScreen boardScreen;
	EditCommand(){
		boardScreen = new BoardScreen();
	}
	@Override
	void click() {
		boardScreen.edit();
	}

}
