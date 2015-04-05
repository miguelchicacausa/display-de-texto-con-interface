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
public class MLetter extends Letter {
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public MLetter(Parameters parametersObj) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra M
	 */
	public void generate(){
		cleanMatrix();
		int a = 0;
		while(a < parameterObj.getHeight()){
			letterMatrix[a][0]= parameterObj.getTypeChar();
			letterMatrix[a][parameterObj.getWidth()-1]= parameterObj.getTypeChar();
			a++;
		}
		int middleHeight=parameterObj.getHeight()/2;
		int middleWidht=parameterObj.getWidth()/2;
		letterMatrix[middleHeight][middleWidht] = parameterObj.getTypeChar();
		a=middleWidht;
		while(a > 0){
			letterMatrix[a][a]= parameterObj.getTypeChar();
			a--;
		}
		a = middleWidht;
		int b = middleHeight;
		while(a > 0){
			letterMatrix[a][b]= parameterObj.getTypeChar();
			a--;
			b++;
		}//fin while
	}// fin metodo
}//fin clase