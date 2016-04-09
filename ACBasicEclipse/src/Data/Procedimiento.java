package Data;

import java.util.ArrayList;
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
	// numero de cuadruplo inicial
	private int cuadruploInicial;
	// tipos de los parametros
	private ArrayList <Integer> tipoParams;
	// tamaño
	private TamañoProcedimiento tamaño;
	
	
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
	
	public int getCuadruploInicial() {
		return cuadruploInicial;
	}

	public void setCuadruploInicial(int cuadruploInicial) {
		this.cuadruploInicial = cuadruploInicial;
	}

	public ArrayList<Integer> getTipoParams() {
		return tipoParams;
	}

	public void setTipoParams(ArrayList<Integer> tipoParams) {
		this.tipoParams = tipoParams;
	}

	/**
	 * Metodo para crear la tabla de variables del procedimiento actual
	 */
	public void crearTablaDeVariables(){
		this.variables = new HashMap<String, Variable>();
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
	
	/**
	 * Método para obtener la cantidad de parametros
	 */
	public int getCantidadParametros() {
		return this.tipoParams.size();
	}
	
}
