package Data;

import java.util.HashMap;

/**
 * Clase que representa un procedimiento (func) del lenguaje ACBasic
 * @author Cesar, Angela
 *
 */
public class Procedimiento {
	// nombre (id) del procedimiento
	private String nombreProcedimiento;
	// tipo (void, int, float, bool...) del procedimiento
	private int tipoProcedimiento;
	// mapa de variables declaradas dentro de este procedimiento en el programa
	// la llave String es el id de la variable
	private HashMap<String, Variable> variables;
	// mapa para los procedimientos locales (condiciones y ciclos)
	private HashMap<String, Procedimiento> bloquesLocales; 
	
	public Procedimiento() {
		super();
	}

	public String getNombreProcedimiento() {
		return nombreProcedimiento;
	}

	public void setNombreProcedimiento(String nombreProcedimiento) {
		this.nombreProcedimiento = nombreProcedimiento;
	}

	public int getTipoProcedimiento() {
		return tipoProcedimiento;
	}

	public void setTipoProcedimiento(int tipoProcedimiento) {
		this.tipoProcedimiento = tipoProcedimiento;
	}

	public HashMap<String, Variable> getVariables() {
		return variables;
	}

	public void setVariables(HashMap<String, Variable> variables) {
		this.variables = variables;
	}

	public HashMap<String, Procedimiento> getBloquesLocales() {
		return bloquesLocales;
	}

	public void setBloquesLocales(HashMap<String, Procedimiento> bloquesLocales) {
		this.bloquesLocales = bloquesLocales;
	}
	
	/**
	 * Metodo para crear la tabla de variables del procedimiento actual
	 */
	public void crearTablaDeVariables(){
		this.variables = new HashMap<String, Variable>();
	}
	
	/**
	 * Metodo para crear la tabla de procedimientos locales del procedimiento actual
	 */
	public void crearTablaDeBloquesLocales(){
		this.bloquesLocales = new HashMap<String,Procedimiento>();

	}
	
	/**
	 * Metodo para dar de alta una variable en el directorio de variables del procedimiento actual
	 * @param variableActual
	 */
	public boolean agregarVariable(Variable variableActual){
		if (this.variables.containsKey(variableActual.getNombreVariable())){
			return false;
		} else {
			this.variables.put(variableActual.getNombreVariable(), variableActual);
			return true;
		}
	}
}
