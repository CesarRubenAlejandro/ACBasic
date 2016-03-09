package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Clase que representa un procedimiento (func) del lenguaje ACBasic
 * @author Cesar
 *
 */
public class Procedimiento {
	// nombre (id) del procedimiento
	private String nombreProcedimiento;
	// tipo (void, int, float, bool...) del procedimiento
	private String tipoProcedimiento;
	// mapa de variables declaradas dentro de este procedimiento en el programa
	// la llave String es el id de la variable
	private HashMap<String, Variable> variables;
	
	public Procedimiento() {
		super();
		variables = new HashMap<String,Variable>();
	}

	public String getNombreProcedimiento() {
		return nombreProcedimiento;
	}

	public void setNombreProcedimiento(String nombreProcedimiento) {
		this.nombreProcedimiento = nombreProcedimiento;
	}

	public String getTipoProcedimiento() {
		return tipoProcedimiento;
	}

	public void setTipoProcedimiento(String tipoProcedimiento) {
		this.tipoProcedimiento = tipoProcedimiento;
	}

	public HashMap<String, Variable> getVariables() {
		return variables;
	}

	public void setVariables(HashMap<String, Variable> variables) {
		this.variables = variables;
	}
}
