package console;
import functional.Letter;
/**
 *Universidad Pedagogica y Tecnologica de Colombia UPTC
 *Facultad de Ingenieria 
 *Ingenieria de sistemas y computacion
 *Materia : Programacion II  
 * Docente: Ing. Jairo Botero  
 * 
 * @author Miguel Angel Chicacausa Garzon cod: 201321840
 */


public class ConsoleLetter {
	/**
	 * metodo que imprime una matriz de caracteres e ingresa por parametro un objeto de la clase padre Letter
	 * @param letterObj
	 */
	public static void print(Letter letterObj){
		for (int i = 0; i < letterObj.getLetterMatrix().length; i++) {
			for (int j = 0; j < letterObj.getLetterMatrix()[i].length; j++) {
				System.out.print(letterObj.getLetterMatrix()[i][j]);
			}
			System.out.println();
		}
	}
	/**
	 * metodo que imprime un vector de caracteres ingresa por parametro un vector de la clase padre Letter
	 * @param letterObj
	 */
	public static void printMatrix(Letter[] letterObj){
		for (int i = 0; i < letterObj[0].getLetterMatrix().length; i++) {
				System.out.print(letterObj[i].getLetterMatrix());
				System.out.println();
		}
	}
}