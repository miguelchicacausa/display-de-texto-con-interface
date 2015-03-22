package swing;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.PositionLetter;
import logic.TextPosition;

public class PanelLetter extends JPanel{
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
		}
	}
	public TextPosition getTextPositionObj() {
		return textPositionObj;
	}
	
}