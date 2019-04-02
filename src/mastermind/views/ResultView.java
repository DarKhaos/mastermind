package mastermind.views;

import mastermind.models.Result;
import mastermind.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	private Result result;

	public ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		this.console.writeln(Message.RESULT.getMessage().replaceFirst("#blacks", "" + this.result.getBlacks())
				.replaceFirst("#whites", "" + this.result.getWhites()));
	}

}
