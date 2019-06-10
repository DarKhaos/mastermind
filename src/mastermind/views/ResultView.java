package mastermind.views;

import mastermind.controllers.GameController;
import mastermind.views.MessageView;

class ResultView {
	
	private GameController gameController;
	
	ResultView(GameController gameController){
		this.gameController = gameController;
	}

	void writeln(int position) {
		MessageView.RESULT.writeln(this.gameController.getBlacks(position),this.gameController.getWhites(position));
	}

}
