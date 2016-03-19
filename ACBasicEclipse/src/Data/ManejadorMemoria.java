package Data;

public class ManejadorMemoria {

	// variables
	private static int contadorInt = 1000;
	private static int contadorFloat = 2000;
	private static int contadorChar = 3000;
	private static int contadorString = 4000;
	private static int contadorBool = 5000;
	
	//temporales
	private static int contadorTemporalInt = 6000;
	private static int contadorTemporalFloat = 7000;
	private static int contadorTemporalChar = 8000;
	private static int contadorTemporalString = 9000;
	private static int contadorTemporalBool = 10000;
	
	public static int getMemoria(int tipoVariable) {
		switch (tipoVariable) {
		case Codigos.INT:
			contadorInt++;
			return contadorInt-1;
		case Codigos.FLOAT:
			contadorFloat++;
			return contadorFloat-1;
		case Codigos.CHAR:
			contadorChar++;
			return contadorChar-1;
		case Codigos.STRING:
			contadorString++;
			return contadorString-1;
		case Codigos.BOOL:
			contadorBool++;
			return contadorBool-1;
		default:
			return 0;
		}	
	}
	
	public static int getMemoriaTemporal(int tipoVariable) {
		switch (tipoVariable) {
		case Codigos.INT:
			contadorTemporalInt++;
			return contadorTemporalInt-1;
		case Codigos.FLOAT:
			contadorTemporalFloat++;
			return contadorTemporalFloat-1;
		case Codigos.CHAR:
			contadorTemporalChar++;
			return contadorTemporalChar-1;
		case Codigos.STRING:
			contadorTemporalString++;
			return contadorTemporalString-1;
		case Codigos.BOOL:
			contadorTemporalBool++;
			return contadorTemporalBool-1;
		default:
			return 0;
		}	
	}
}
