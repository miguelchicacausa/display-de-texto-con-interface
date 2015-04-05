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
public class YLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public YLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra Y
	 */
	public void generate(){
		int a = parameterObj.getHeight()/2;
		int b = parameterObj.getWidth()/2;
		int c = parameterObj.getHeight()/2;
		int d = parameterObj.getWidth()/2;
		
		while(a >=0 && b >= 0){
			letterMatrix[a][b]= parameterObj.getTypeChar();
			a--;
			b--;
		}
		while(c >= 0 && d < parameterObj.getWidth()){
			letterMatrix[c][d]= parameterObj.getTypeChar();
			c--;
			d++;
		}
		for (int i = parameterObj.getHeight()/2; i < parameterObj.getWidth(); i++) {
			letterMatrix[parameterObj.getHeight()/2][parameterObj.getWidth()/2] = parameterObj.getTypeChar();
			letterMatrix[i][parameterObj.getWidth()/2] = parameterObj.getTypeChar();
		}// fin for
	}// fin metodo
}//fin clase
