package mastermind;

import java.util.ArrayList;
import java.util.List;

import santaTecla.utils.WithConsoleModel;
import santaTecla.utils.YesNoDialog;

public class Mastermind extends WithConsoleModel {

	private static final int MAX_LONG = 10;

	private SecretCombination secretCombination;

	private List<ProposedCombination> proposedCombinations;

	private List<Result> results;

	private int attempts;

	private Mastermind() {
		this.clear();
	}

	private void clear() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
		this.attempts = 0;
	}

	private void play() {
		boolean newGame;
		do {
			Message.TITLE.writeln();
			this.secretCombination.writeln();
			boolean finished = false;
			do {
				ProposedCombination proposedCombination = new ProposedCombination();
				proposedCombination.read();
				this.proposedCombinations.add(proposedCombination);
				this.results.add(this.secretCombination.getResult(proposedCombination));
				this.attempts++;
				this.console.writeln();
				Message.ATTEMPTS.writeln(this.attempts);
				this.secretCombination.writeln();
				for (int i = 0; i < this.attempts; i++) {
					this.proposedCombinations.get(i).write();
					this.results.get(i).writeln();
				}
				if (this.results.get(this.attempts - 1).isWinner()) {
					Message.WINNER.writeln();
					finished = true;
				} else if (this.attempts == Mastermind.MAX_LONG) {
					Message.LOOSER.writeln();
					finished = true;
				}
			} while (!finished);
			Message.RESUME.write();
			newGame = new YesNoDialog().read();
			if (newGame) {
				this.clear();
			}
		} while (newGame);
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
