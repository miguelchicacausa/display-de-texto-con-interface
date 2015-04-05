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
public class OLetter extends Letter {
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public OLetter(Parameters parametersObj) {
		super(parametersObj);
	}
	/**
	 * metodo sobreescrito que designa el tipo de caracter
	 */
	@Override
	public void setLetter(char letter) {
		super.setLetter('*');
	}
	/**
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra O
	 */
	public void generate(){
		cleanMatrix();
		for (int i = 0; i < letterMatrix[0].length; i++) { //llena horizontal, primera y ultima fila
			letterMatrix[0][i]= parameterObj.getTypeChar();
			letterMatrix[parameterObj.getHeight() - 1][i] = parameterObj.getTypeChar();
		}
		for (int j = 1; j < letterMatrix[1].length-1; j++) {
			letterMatrix[j][0]= parameterObj.getTypeChar();
			letterMatrix[j][parameterObj.getWidth()-1]= parameterObj.getTypeChar();
		}
		for (int i = 1; i < letterMatrix.length-1; i++) {
			for (int j = 1; j < letterMatrix[i].length-1; j++) {
				letterMatrix[i][j]= ' ';
			}//fin for interno
		}// fin for externo
	}//fin metodo
}// fin clase
