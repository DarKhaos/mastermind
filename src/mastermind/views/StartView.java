package mastermind.views;

import mastermind.controllers.StartController;

class StartView extends WithConsoleView {
	
	private static final String TITTLE = "--------- MASTERMIND ---------";
	
	public void interact(StartController startController) {
		startController.start();
		this.console.writeln(StartView.TITTLE);
		new SecretCombinationView().writeln(startController.getWidth());
	}

}
