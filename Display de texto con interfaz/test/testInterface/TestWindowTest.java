package testInterface;

import swing.WindowText;

public class TestWindowTest {

	public static void main(String[] args) {
		if(args[0].equals("Nederlands")){
			System.out.println("Aplicacion en holandes");
			WindowText windowText = new WindowText();
			windowText.setVisible(true);
		}else{
			System.out.println("No puede modificar datos");
		}
	}
}
