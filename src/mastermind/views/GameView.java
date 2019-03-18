package mastermind.views;

import mastermind.controllers.GameController;
import mastermind.utils.WithConsoleView;

class GameView extends WithConsoleView {

	GameController gameController;

	GameView(GameController gameController) {
		this.gameController = gameController;
	}

	void writeln() {
		this.console.writeln();
		this.console.writeln(Message.TURN.getMessage().replaceFirst("#turn", "" + this.gameController.getTurn()));
		new SecretCombinationView().writeln(this.gameController.getWidth());
		int[][][] allCodes = this.gameController.getAllCodes();
		for (int i = 0; i < allCodes.length; i++) {
			new ProposedCombinationView().write(allCodes[i][0]);
			new ResultView().writeln(allCodes[i][1]);
		}
		if (this.gameController.isWinner()) {
			this.console.writeln(Message.WINNER.getMessage());
		} else if (this.gameController.isLooser()) {
			this.console.writeln(Message.LOOSER.getMessage());
		}
	}

}
