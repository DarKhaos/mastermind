package mastermind;

import mastermind.models.Game;
import mastermind.views.View;

public class Mastermind {

	private Game game;
	
	private View view;

	private Mastermind() {
		this.game = new Game();
		this.view = new View();
	}

	private void play() {
		this.view.interact(this.game);
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}	

}
