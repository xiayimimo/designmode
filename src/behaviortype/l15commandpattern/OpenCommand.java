package behaviortype.l15commandpattern;

public class OpenCommand extends AbstractCommand {
	
	private BoardScreen boardScreen;
	OpenCommand(){
		boardScreen = new BoardScreen();
	}
	@Override
	void click() {
		boardScreen.open();
	}

}
