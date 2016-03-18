package Data;

public class CuboSemantico {
	private int[][][] cubo;
	
	public CuboSemantico(){
		cubo = new int [5][5][7];
		// llenado del cubo semantico
		// INT izquiedo
		// int con int
		cubo[Codigos.INT][Codigos.INT][Codigos.SUMA] = Codigos.INT;
		cubo[Codigos.INT][Codigos.INT][Codigos.RESTA] = Codigos.INT;
		cubo[Codigos.INT][Codigos.INT][Codigos.DIV] = Codigos.INT;
		cubo[Codigos.INT][Codigos.INT][Codigos.MULT] = Codigos.INT;
		cubo[Codigos.INT][Codigos.INT][Codigos.ASIGN] = Codigos.INT;
		cubo[Codigos.INT][Codigos.INT][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.INT][Codigos.OPREL] = Codigos.ERROR;
		
		// int con float
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.SUMA] = Codigos.FLOAT;
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.RESTA] = Codigos.FLOAT;
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.DIV] = Codigos.FLOAT;
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.MULT] = Codigos.FLOAT;
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.ASIGN] = Codigos.INT;
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.FLOAT][Codigos.OPREL] = Codigos.ERROR;
		
		// int con char
		cubo[Codigos.INT][Codigos.CHAR][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.CHAR][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.CHAR][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.CHAR][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.CHAR][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.CHAR][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.CHAR][Codigos.OPREL] = Codigos.ERROR;
		
		// int con string
		cubo[Codigos.INT][Codigos.STRING][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.STRING][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.STRING][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.STRING][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.STRING][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.STRING][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.STRING][Codigos.OPREL] = Codigos.ERROR;
		
		// int con bool
		cubo[Codigos.INT][Codigos.BOOL][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.BOOL][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.BOOL][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.BOOL][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.BOOL][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.BOOL][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.INT][Codigos.BOOL][Codigos.OPREL] = Codigos.ERROR;
		
		// FLOAT izquierdo
		// float con int
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.SUMA] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.RESTA] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.DIV] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.MULT] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.ASIGN] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.INT][Codigos.OPREL] = Codigos.ERROR;
		
		// float con float
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.SUMA] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.RESTA] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.DIV] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.MULT] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.ASIGN] = Codigos.FLOAT;
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.FLOAT][Codigos.OPREL] = Codigos.ERROR;
		
		// float con char
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.CHAR][Codigos.OPREL] = Codigos.ERROR;
		
		// float con string
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.STRING][Codigos.OPREL] = Codigos.ERROR;
		
		// float con bool
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.FLOAT][Codigos.BOOL][Codigos.OPREL] = Codigos.ERROR;
		
		// CHAR lado izquerdo
		// char con int
		cubo[Codigos.CHAR][Codigos.INT][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.INT][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.INT][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.INT][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.INT][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.INT][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.INT][Codigos.OPREL] = Codigos.ERROR;
		
		// char con float
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.FLOAT][Codigos.OPREL] = Codigos.ERROR;
		
		// char con char
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.ASIGN] = Codigos.CHAR;
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.CHAR][Codigos.OPREL] = Codigos.ERROR;
		
		// char con string
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.STRING][Codigos.OPREL] = Codigos.ERROR;
		
		// char con bool
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.SUMA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.RESTA] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.DIV] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.MULT] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.ASIGN] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.OPLOGIC] = Codigos.ERROR;
		cubo[Codigos.CHAR][Codigos.BOOL][Codigos.OPREL] = Codigos.ERROR;
		
		// STRING lado izquierdo
	}
	
}
