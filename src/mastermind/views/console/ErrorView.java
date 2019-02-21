package mastermind.views.console;

import java.util.HashMap;
import java.util.Map;

class ErrorView extends WithConsoleView {

	private static Map<Integer, String> MESSAGES;
	
	// TODO cambiar a enumerado!!!
	private static final int DUPLICATED = 0;
	private static final int WRONG_CHARACTERS = 1;
	private static final int WRONG_LENGTH = 2;

	static {
		ErrorView.MESSAGES = new HashMap<Integer, String>();
		ErrorView.MESSAGES.put(ErrorView.DUPLICATED, "Colores repetidos");
		ErrorView.MESSAGES.put(ErrorView.WRONG_CHARACTERS, "Colores err�neos, tienen que ser: #initials");
		ErrorView.MESSAGES.put(ErrorView.WRONG_LENGTH, "Error en la longitud de la combinaci�n");
	}

	void write(int error) {
		String message = ErrorView.MESSAGES.get(error);
		if (error == ErrorView.WRONG_CHARACTERS) {
			message = message.replaceFirst("#initials", ColorView.allInitials());
		}
		this.console.writeln(message);
	}

}
