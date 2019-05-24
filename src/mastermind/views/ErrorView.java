package mastermind.views;

import mastermind.types.Error;
import mastermind.utils.Console;

public class ErrorView {

	static final String[] MESSAGES = { 
		"Repeated colors",
		"Wrong colors, they must be: " + ColorView.allInitials(), 
		"Wrong proposed combination length" };

	Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	String getMessage() {
		return ErrorView.MESSAGES[this.error.ordinal()];
	}
	
	public void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	
	
}
