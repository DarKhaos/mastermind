package mastermind.views;

enum Error {
	
	DUPLICATED("Colores repetidos"),
	WRONG_CHARACTERS("Colores err�neos, tienen que ser: " + Color.allInitials()),
	WRONG_LENGTH("Error en la longitud de la combinaci�n");
	
	private String message;
	
	private Error(String message) {
		this.message = message;
	}
	
	String getMessage() {
		return this.message;
	}
	
}
