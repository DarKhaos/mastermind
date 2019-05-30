package mastermind.views;

import mastermind.models.SecretCombination;
import mastermind.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {
	
	private SecretCombination secretCombination;
	
	public SecretCombinationView(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}

	void writeln() {
		for (int i = 0; i < this.secretCombination.getColors().size(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
