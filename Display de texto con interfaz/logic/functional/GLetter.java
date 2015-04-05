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

public class GLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public GLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra G
	 */
	public void generate(){
		cleanMatrix();
		int i =0;
		int k = parameterObj.getHeight()/2;
		while (i < letterMatrix[0].length) {
			letterMatrix[0][i]= parameterObj.getTypeChar();
			letterMatrix[parameterObj.getHeight()/2][parameterObj.getWidth()/2]= parameterObj.getTypeChar();
			letterMatrix[parameterObj.getHeight() - 1][i] = parameterObj.getTypeChar();
			letterMatrix[i][0]= parameterObj.getTypeChar();
			i++;
		}
		while(k < parameterObj.getWidth()){
			 letterMatrix[k][parameterObj.getWidth()-1] = parameterObj.getTypeChar();
			 letterMatrix[parameterObj.getHeight()/2][k]= parameterObj.getTypeChar();
			 k++;
		 }//fin de 2° while
	}//fin metodo
}//fin clase
