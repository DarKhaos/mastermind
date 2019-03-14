package mastermind.views;

import mastermind.models.Game;
import mastermind.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact(Game game) {
		this.console.writeln(Message.TITLE.getMessage());
		new SecretCombinationView().writeln(game.getWidth());
	}

}
