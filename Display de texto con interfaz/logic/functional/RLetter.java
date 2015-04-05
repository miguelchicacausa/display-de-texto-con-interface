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

public class RLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public RLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra R
	 */
	public void generate(){
		cleanMatrix();
		for (int i = 0; i < letterMatrix[0].length; i++) {
			letterMatrix[0][i]= parameterObj.getTypeChar();
			letterMatrix[parameterObj.getHeight()/2][i]= parameterObj.getTypeChar();
		}
		for (int j = 1; j < letterMatrix[1].length-1; j++) {
			letterMatrix[j][0]= parameterObj.getTypeChar();
			letterMatrix[j/2][parameterObj.getWidth()-1]= parameterObj.getTypeChar();		
			}
		int e = parameterObj.getHeight()/2;
		int f = parameterObj.getWidth()/2;
		while(e < parameterObj.getHeight() && f < parameterObj.getWidth()){
			letterMatrix[e][f]= parameterObj.getTypeChar();
			e++;
			f++;
		}//fin while
	}// fin metodo
	}// fin clase

