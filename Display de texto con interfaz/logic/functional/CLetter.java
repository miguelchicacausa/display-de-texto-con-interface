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

public class CLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public CLetter(Parameters parameters) {
		super(parameters);
	}
	/**
	 * metodo sobreescrito que designa el tipo de caracter
	 */
	@Override
	public void setLetter(char letter) {
		super.setLetter('*');
	}
	/**
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra C
	 */
	public void generate(){
			cleanMatrix();
			int i = 0;
			int j = 1;
			do {
				letterMatrix[0][i]= parameterObj.getTypeChar();
				letterMatrix[parameterObj.getHeight() - 1][i] = parameterObj.getTypeChar();
				i++;
			} while (i < letterMatrix[0].length);
			do {
				letterMatrix[j][0]= parameterObj.getTypeChar();
				j++;
			} while (j < letterMatrix[1].length-1);
	}//fin metodo
}//fin clase
