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

public class XLetter extends Letter{

	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public XLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra X
	 */
	public void generate(){
		cleanMatrix();
		int a = parameterObj.getHeight()/2;
		int b = parameterObj.getWidth()/2;
		int c = parameterObj.getHeight()/2;
		int d = parameterObj.getWidth()/2;
		int e = parameterObj.getHeight()/2; 
		int f = parameterObj.getWidth()/2;
		int g = parameterObj.getHeight()/2; 
		int h = parameterObj.getWidth()/2;
		
		do{
			letterMatrix[a][b]= parameterObj.getTypeChar();
			a--;
			b--;
		}while(a >=0 && b >= 0);
			
		do{
			letterMatrix[c][d]= parameterObj.getTypeChar();
			c--;
			d++;
		}while(c >= 0 && d < parameterObj.getWidth());
			
		do{
			letterMatrix[e][f]= parameterObj.getTypeChar();
			e++;
			f++;
		}while(e < parameterObj.getHeight() && f < parameterObj.getWidth());
			
		do{
			letterMatrix[g][h] = parameterObj.getTypeChar();
			g++;
			h--;
		}while(g < parameterObj.getHeight() && h >=0);
		}// fin  metodo
	}//fin clase

