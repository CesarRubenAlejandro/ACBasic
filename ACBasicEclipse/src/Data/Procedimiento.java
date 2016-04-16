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
	
	// DIRECCION(es) VIRTUAL(es) de los PARAMETROS
	private ArrayList<Integer> direccionParametros;
	
	// tamaño
	private TamañoProcedimiento tamaño;
	// identificador del procedimiento
	private int identificadorProcedimiento;
	
	
	public Procedimiento() {
		super();
		tipoParams = new ArrayList<Integer>();
		tamaño = new TamañoProcedimiento();
		direccionParametros = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getDireccionParametros() {
		return direccionParametros;
	}

	public void setDireccionParametros(ArrayList<Integer> direccionParametros) {
		this.direccionParametros = direccionParametros;
	}



	public int getIdentificadorProcedimiento() {
		return identificadorProcedimiento;
	}

	public void setIdentificadorProcedimiento(int identificadorProcedimiento) {
		this.identificadorProcedimiento = identificadorProcedimiento;
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

	public TamañoProcedimiento getTamaño() {
		return tamaño;
	}

	public void setTamaño(TamañoProcedimiento tamaño) {
		this.tamaño = tamaño;
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
	
	/**
	 * Metodo para guardar la informacion referente al tamano del procedimiento
	 */
	public void llenaTamañoVar(){
		// guardar el tamano de las variables en el mapa
		for (Variable actual: this.variables.values()){
			this.tamaño.setTamañoVar(actual.getTipoVariable());
		}
	}
	
	/**
	 * Metodo para comparar los parametros de una llamada con los parametros 
	 * esperados en la funcion
	 */
	public boolean comparaParams(ArrayList <Integer> paramLlamada) {
		if(paramLlamada.size() != this.getCantidadParametros()) {
			return false;
		}
		for(int i=0; i<paramLlamada.size(); i++){
			if (paramLlamada.get(i)!= this.tipoParams.get(i)){
				return false;
			}
		}
		return true;
	}
}
