package mastermind.controllers;

import mastermind.models.Game;
import mastermind.views.GameView;

class GameController {

	private GameView gameView;

	private Game game;

	GameController() {
		SecretCombinationController secretCombinationController = new SecretCombinationController();
		this.game = new Game(secretCombinationController.getSecretCombination());
		this.gameView = new GameView(this.game, secretCombinationController.getSecretCombinationView());
		this.game.addObserver(this.gameView);
	}

	void proposeCombination() {
		ProposedCombinationController proposecombinationController = new ProposedCombinationController();
		proposecombinationController.proposeCombination();
		this.gameView.addProposedCombinationView(proposecombinationController.getProposeCombinationView());
		this.game.addProposedCombination(proposecombinationController.getProposeCombination());
		ResultController resultController = new ResultController(this.game.getResult());
		this.gameView.addResultView(resultController.getResultView());
		this.game.addResult(resultController.getResult());
	}

	Game getGame() {
		return this.game;
	}

}
