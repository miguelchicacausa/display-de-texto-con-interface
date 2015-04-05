package functional;
/**
 * Representa los parametros generales de la aplicacion
 * @author miguel angel chicacausa
 *
 */

public class Parameters {
	public static final int DEFAULT_HEIGHT = 5;
	public static final int DEFAULT_WIDHT = 5;
	public static final char DEFAULT_CHARACTER = '*';
	/**
	 * dato que corresponde a la altura de la letra
	 */
	private int height;
	/**
	 * dato que corresponde al ancho de la letra
	 */
	private int width;
	/**
	 * dato que corresponde al tipo de caracter del que estara conformado la letra ingresada
	 */
	private char typeChar;
	
	/**
	 * constructor de la clase sin parametros
	 */
	public Parameters(){
		this.height = DEFAULT_HEIGHT;
		this.width = DEFAULT_WIDHT;
		this.typeChar = DEFAULT_CHARACTER;
		
	}
	/**
	 * constructor (sobrecargado) de la clase
	 * @param height
	 * @param widht
	 * @param typeChar
	 */
	public Parameters(int height, int widht, char typeChar){
		this.height = height;
		this.width = widht;
		this.typeChar = typeChar;
	}
	/**
	 * metodo que obtiene la altura de la matriz	 
	 * @return alto de la matriz
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * metodo vacio que asigna el alto de la matriz
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * metodo que asigna el ancho de la matriz
	 * @return ancho de la matriz
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * metodo vacio que asigna el ancho de la matriz
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * metodo que obtiene el tipo de caracter
	 * @return tipo de caracter
	 */
	public char getTypeChar() {
		return typeChar;
	}
	/**
	 * metodo vacio que asigna el tipo de caracter
	 * @param typeChar
	 */
	public void setTypeChar(char typeChar) {
		this.typeChar = typeChar;
	}
}//fin clase
