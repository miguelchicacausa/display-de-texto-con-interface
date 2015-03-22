package swing;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.PositionLetter;
import logic.TextPosition;

public class PanelLetter extends JPanel implements Runnable{
	public static final int SIZE_LETTER = 40;
	private JLabel[] arrayLabels;
	private TextPosition textPositionObj;
	
	public PanelLetter() {
		setLayout(null);
		textPositionObj = new TextPosition("Demo de panelLetter");
		textPositionObj.generate();
		fillArrayLabels();
	}
	public void fillArrayLabels(){
		arrayLabels = new JLabel[textPositionObj.getArray().length];
		for (int i = 0; i < arrayLabels.length; i++) {
			arrayLabels[i] = new JLabel(textPositionObj.getArray()[i].getLetter() +""); //+"" convierte a strines
			arrayLabels[i].setBounds(textPositionObj.getArray()[i].getPosX(), 
														textPositionObj.getArray()[i].getPosY(), 
														SIZE_LETTER, SIZE_LETTER);
			this.add(arrayLabels[i]);
		}
	}
	public void clean(){
		for (int i = 0; i < arrayLabels.length; i++) {
			remove(arrayLabels[i]);
		}
		this.validate(); // como F5 en internet
	}
	public void move(){
		PositionLetter.limitX = getWidth();
		PositionLetter.limitY = getHeight();
		textPositionObj.move();
		for (int i = 0; i < arrayLabels.length; i++) {
			arrayLabels[i].setLocation(textPositionObj.getArray()[i].getPosX(), 
														textPositionObj.getArray()[i].getPosY());
			Thread threadObj = new Thread(textPositionObj.getArray()[i]);
			threadObj.start();
		}
		//prueba de run de Runnable
		Thread threadObjDisplay = new Thread(this);
		threadObjDisplay.start();
//		Thread threadObj1 = new Thread(textPositionObj.getArray()[1]);
//		threadObj1.start();
		
	}
	public TextPosition getTextPositionObj() {
		return textPositionObj;
	}
	@Override
	public void run(){ //refresca, que se hace
		while(true){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < arrayLabels.length; i++) {
			arrayLabels[i].setLocation(textPositionObj.getArray()[i].getPosX(), 
														textPositionObj.getArray()[i].getPosY());
			}
		}
	}
	public void animation(){
		Thread arrayThreadObj[] = new Thread[arrayLabels.length];
		for (int i = 0; i < arrayThreadObj.length; i++) {
			arrayThreadObj[i] = new Thread(textPositionObj.getArray()[i]);
			arrayThreadObj[i].start();
		}
	}
}// las letras deben arrancar pa todo lado, diferente velocidad c/u, boton que arranque y detenga el hilo