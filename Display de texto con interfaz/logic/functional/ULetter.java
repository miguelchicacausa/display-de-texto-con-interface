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

public class ULetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public ULetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra U
	 */
	public void generate(){
		cleanMatrix();
		int i =0;
		int j=1;
		while(i < letterMatrix[0].length){
			letterMatrix[parameterObj.getHeight() - 1][i] = parameterObj.getTypeChar();
			i++;
		}
		do{
			letterMatrix[j][0]= parameterObj.getTypeChar();
			letterMatrix[j][parameterObj.getWidth()-1]= parameterObj.getTypeChar();
			j++;
		}while(j < letterMatrix[0].length);
			
		for (int k = 1; k < letterMatrix.length-1; k++) {
			for (int d = 1; j < letterMatrix[k].length-1; d++) {
				letterMatrix[k][d]= ' ';
			}// fin for interno
		}//fin for externo
	}// fin metodo
}// fin clase
