package mastermind.views;

public enum Message_ES {
	TURN("#turn intento(s): "),
	SECRET("*"),
	RESUME("�Desea continuar?"),
	RESULT(" --> #blacks negros y #whites blancos"),
	PROPOSED_COMBINATION("Prop�n una combinaci�n: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("Victoria!!! ;-)"),
	LOOSER("Has agotado nuestra paciencia!!! :-("),
	OPTION("----- Elige una opci�n -----"),
	PROPOSE_COMMAND("Proponer Combinaci�n"),
	UNDO_COMMAND("Deshacer propuesta anterior"),
	REDO_COMMAND("Rehacer propuesta anterior");

	private String message;
	
	private Message_ES(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
