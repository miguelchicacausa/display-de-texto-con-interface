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

public class SLetter extends Letter{
	/**
	 * constructor de la clase
	 * @param parameters
	 */
	public SLetter(Parameters parameters) {
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
	 * metodo que limpia la matriz y luego genera una matriz de caracteres en forma de la letra S
	 */
	public void generate(){
	 cleanMatrix();
	 int i =0;
	 int j = 0;
	 int k =parameterObj.getHeight()/2;
	 while(i < parameterObj.getWidth()){
		 letterMatrix[0][i] = parameterObj.getTypeChar();
		 letterMatrix[parameterObj.getHeight()/2][i] = parameterObj.getTypeChar();
		 letterMatrix[parameterObj.getHeight()-1][i] = parameterObj.getTypeChar();
		 i++;
	 }
	 while(j < parameterObj.getHeight()/2){
		 letterMatrix[j][0]= parameterObj.getTypeChar();
		 j++;
	 }
	 while(k < parameterObj.getWidth()){
		 letterMatrix[k][parameterObj.getWidth()-1] = parameterObj.getTypeChar();
		 k++;
	 }// fin while
	}// fin metodo
}// fin clase
