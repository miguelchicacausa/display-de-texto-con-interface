package functional;
/**
 *Universidad Pedagogica y Tecnologica de Colombia UPTC
 *Facultad de Ingenieria 
 *Ingenieria de sistemas y computacion
 *Materia : Programacion II  
 * Docente: Ing. Jairo Botero  
 * 
 * @author Miguel Angel Chicacausa Garzon cod: 201321840
 */

public abstract class Letter { 
	/**
	 * variable protegida de tipo char, que designa la letra
	 */
	protected char letter;
	/**
	 * variable protegida de tipo Parameters que construye una matriz con los datos ingresados
	 */
	protected Parameters parameterObj;
	/**
	 * matriz protegida que crea una matriz de caracteres con forma de una letra 
	 */
	protected char[][] letterMatrix;
	// pretegido para q se use dentro de las clases en las q se invoque
	
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public Letter(Parameters parameters){
		this.letter = letter;
		this.parameterObj = parameters;
		this.letterMatrix = new char[parameterObj.getHeight()][parameterObj.getWidth()];
	}
	/**
	 * metodo que limpia una matriz, la llena con espacios y se vuelve a rellenar con caracteres en distintas posiciones de una matriz 
	 */
	public void cleanMatrix(){
		for (int i = 0; i < letterMatrix.length; i++) {
			for (int j = 0; j < letterMatrix[0].length; j++) {
				letterMatrix[i][j]= ' ';
			}// fin for interno
		}//fin for externo
	}//fin metodo
	
	/**
	 * metodo abstracto que obliga a que todas las clases que hereden de esta, tengan este metodo 
	 */
	public abstract void generate();

	/**
	 * metodo de tipo char que obtiene la letra ingresada
	 * @return letra ingresada
	 */
	public char getLetter() {
		return letter;
	}
	/**
	 * metodo vacio que asigna una letra 
	 * @param letter
	 */
	public void setLetter(char letter) {
		this.letter = letter;
	}
	/**
	 * metodo de tipo Parameters que retorna los parametros ingresados
	 * @return
	 */
	public Parameters getParameterObj() {
		return parameterObj;
	}
	/**
	 * metodo vacio que asigna los parametros ingresados
	 * @param parameterObj
	 */
	public void setParameterObj(Parameters parameterObj) {
		this.parameterObj = parameterObj;
	}
	/**
	 * metodo de tipo char[][] que obtiene una matriz de caracteres
	 * @return matriz de caracteres
	 */
	public char[][] getLetterMatrix() {
		return letterMatrix;
	}
	/**
	 * metodo vacio que asigna una matriz de caracteres
	 * @param letterMatrix
	 */
	public void setLetterMatrix(char[][] letterMatrix) {
		this.letterMatrix = letterMatrix;
	}

}//fin clase
