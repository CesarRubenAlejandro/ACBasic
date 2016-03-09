package Data;

import java.util.HashMap;

/**
 * Clase que representa la tabla de procedimientos de un programa 
 * @author Cesar, Angela
 *
 */
public class DirectorioProcedimientos {
	// mapa que guarda todos los procedimientos. 
	// la llave String es el id del procedimiento
	private HashMap<String, Procedimiento> procedimientos;

	public DirectorioProcedimientos() {
		super();
		procedimientos = new HashMap<String, Procedimiento> ();
	}

	public HashMap<String, Procedimiento> getProcedimientos() {
		return procedimientos;
	}

	public void setProcedimientos(HashMap<String, Procedimiento> procedimientos) {
		this.procedimientos = procedimientos;
	}
	
	/**
	 * Metodo para dar de alta un procedimiento en el directorio de procedimientos
	 * @param procedimientoActual
	 */
	public boolean agregarProcedimiento(Procedimiento procedimientoActual){
		if (this.procedimientos.containsKey(procedimientoActual.getNombreProcedimiento())){
			return false;
		} else {
			this.procedimientos.put(procedimientoActual.getNombreProcedimiento(), procedimientoActual);
			return true;
		}
	}

}
