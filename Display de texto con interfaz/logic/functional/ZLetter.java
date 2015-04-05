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
public class ZLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public ZLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra Z
	 */
	public void generate(){
		cleanMatrix();
		int i = 0;
		while (i < letterMatrix[0].length){
			letterMatrix[0][i]= parameterObj.getTypeChar();
			letterMatrix[parameterObj.getHeight() - 1][i] = parameterObj.getTypeChar();
			i++;
		} 
		int g = parameterObj.getHeight()/2; 
		int h = parameterObj.getWidth()/2;
		while(g < parameterObj.getHeight() && h > 0){
			letterMatrix[g][h] = parameterObj.getTypeChar();
			g++;
			h--;
		}
		int c = parameterObj.getHeight()/2;
		int d = parameterObj.getWidth()/2;
		while(c > 0 && d < parameterObj.getWidth()){
			letterMatrix[c][d]= parameterObj.getTypeChar();
			c--;
			d++;
		}//fin while
	}// fin metodo 
	}// fin clase

