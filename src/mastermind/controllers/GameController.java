package mastermind.controllers;

import mastermind.models.Game;
import mastermind.views.GameView;

public class GameController {
	
	private SecretCombinationController secretCombinationController;
	
	private ProposedCombinationController proposecombinationController;
	
	private Game game;
	
	private GameView gameView;
	
	public GameController() {
		this.secretCombinationController = new SecretCombinationController();
		this.game = new Game(this.secretCombinationController.getSecretCombination());
		this.gameView = new GameView(this.game);
		this.game.addObserver(this.gameView);
	}

	public Game getGame() {
		return this.game;
	}

	public void proposeCombination() {
		this.proposecombinationController = new ProposedCombinationController();
		this.proposecombinationController.proposeCombination();
		this.game.addProposedCombination(this.proposecombinationController.getProposeCombination());
	}
	
	

}
