package mastermind.controllers;

import mastermind.models.ProposedCombination;
import mastermind.views.ProposedCombinationView;

class ProposedCombinationController {

	private ProposedCombinationView proposedCombinationView;

	private ProposedCombination proposedCombination;

	ProposedCombinationController() {
		this(new ProposedCombination());
	}

	ProposedCombinationController(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
		this.proposedCombinationView = new ProposedCombinationView(this.proposedCombination);
	}

	void proposeCombination() {
		this.proposedCombinationView.read();
	}

	ProposedCombination getProposeCombination() {
		return this.proposedCombination;
	}

	ProposedCombinationView getProposeCombinationView() {
		return this.proposedCombinationView;
	}

}
