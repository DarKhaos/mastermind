package mastermind.models;

import mastermind.controllers.StateValue;

public interface Session {

	StateValue getValueState();
	
	int getWidth();
	
}
