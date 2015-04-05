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

public class KLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public KLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra K
	 */
	public void generate(){
		cleanMatrix();
		for (int i = 0; i < letterMatrix[0].length; i++) {
			letterMatrix[parameterObj.getHeight()/2][i/2]= parameterObj.getTypeChar();
			letterMatrix[i][0]= parameterObj.getTypeChar();
		}
		int c = parameterObj.getHeight()/2;
		int d = parameterObj.getWidth()/2;
		while(c >= 0 && d < parameterObj.getWidth()){
			letterMatrix[c][d]= parameterObj.getTypeChar();
			c--;
			d++;
		}//fin while
		int e = parameterObj.getHeight()/2;
		int f = parameterObj.getWidth()/2;
		while(e < parameterObj.getHeight() && f < parameterObj.getWidth()){
			letterMatrix[e][f]= parameterObj.getTypeChar();
			e++;
			f++;
		}// fin while
	}//fin metodo
}//fin clase
