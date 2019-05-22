package mastermind.views;

import mastermind.controllers.GameController;
import mastermind.utils.WithConsoleView;
import mastermind.views.MessageView;

class ResultView extends WithConsoleView {
	
	private GameController gameController;
	
	ResultView(GameController gameController){
		this.gameController = gameController;
	}

	void writeln(int i) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.gameController.getBlacks(i))
				.replaceFirst("#whites", "" + this.gameController.getWhites(i)));
	}

}
