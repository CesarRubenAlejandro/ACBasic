package Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la tabla de procedimientos de un programa 
 * @author Cesar
 *
 */
public class DirectorioProcedimientos {
	private List<Procedimiento> procedimientos;

	public DirectorioProcedimientos() {
		super();
		procedimientos = new ArrayList<Procedimiento> ();
	}

	public List<Procedimiento> getProcedimientos() {
		return procedimientos;
	}

	public void setProcedimientos(List<Procedimiento> procedimientos) {
		this.procedimientos = procedimientos;
	}
}
