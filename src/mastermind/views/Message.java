package mastermind.views;

public enum Message {
	
	TURN("#turn intento(s): "),
	SECRET("*"),
	RESUME("�Desea continuar?"),
	RESULT(" --> #blacks negros y #whites blancos"),
	PROPOSED_COMBINATION("Prop�n una combinaci�n: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("Victoria!!! ;-)"),
	LOOSER("Has agotado nuestra paciencia!!! :-(");

	private String message;
	
	private Message(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
