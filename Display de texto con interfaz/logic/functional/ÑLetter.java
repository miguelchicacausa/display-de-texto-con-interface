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
public class ÑLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public ÑLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra Ñ
	 */
	public void generate(){
		cleanMatrix();
		int a = 0;
		while(a < parameterObj.getHeight()){
			letterMatrix[0][a]= parameterObj.getTypeChar();
			letterMatrix[a][0]= parameterObj.getTypeChar();
			letterMatrix[a][parameterObj.getWidth()-1]= parameterObj.getTypeChar();
			a++;
		}
		int b = parameterObj.getHeight()/2;
		int c = parameterObj.getWidth()/2;
		while(b >=0 && c >= 0){ //eje -x, +y
			letterMatrix[b][c]= parameterObj.getTypeChar();
			b--;
			c--;
		}
		int e = parameterObj.getHeight()/2; 
		int f = parameterObj.getWidth()/2;
		while(e < parameterObj.getHeight() && f < parameterObj.getWidth()){
			letterMatrix[e][f]= parameterObj.getTypeChar();
			e++;
			f++;
			}//fin while
		}	//fin metodo
	}//fin clase
