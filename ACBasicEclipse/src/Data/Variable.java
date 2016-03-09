package Data;

/**
 * Clase que representa una variable del lenguaje ACBasic
 * @author Cesar, Angela
 *
 */
public class Variable {
	// nombre de la variable (ID)
	private String nombreVariable;
	// define el tipo de la variable (int, float, bool, ...)
	private String tipoVariable;
	// define el alcance de la variable (global, local)
	private String scope;
	
	public Variable() {
		super();
	}

	public Variable(String nombreVariable, String tipoVariable, String scope) {
		super();
		this.nombreVariable = nombreVariable;
		this.tipoVariable = tipoVariable;
		this.scope = scope;
	}
	
	public String getNombreVariable() {
		return nombreVariable;
	}
	public void setNombreVariable(String nombreVariable) {
		this.nombreVariable = nombreVariable;
	}
	public String getTipoVariable() {
		return tipoVariable;
	}
	public void setTipoVariable(String tipoVariable) {
		this.tipoVariable = tipoVariable;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
}
