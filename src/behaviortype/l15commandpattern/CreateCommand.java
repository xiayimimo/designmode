package behaviortype.l15commandpattern;

public class CreateCommand extends AbstractCommand {

	private BoardScreen boardScreen;
	CreateCommand(){
		boardScreen = new BoardScreen();
	}
	@Override
	void click() {
		boardScreen.create();
	}

}
