package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Clase que representa la tabla de procedimientos de un programa 
 * @author Cesar
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

}
