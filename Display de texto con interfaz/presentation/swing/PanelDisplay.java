package swing;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.TextPosition;

public class PanelDisplay extends JPanel{
	public static final int SIZE_LETTER = 100;
	private JLabel[] arrayLabels;
	private JLabel label;
	private TextPosition textPositionObj;
	
	public PanelDisplay(String text){
		this.setBackground(Color.GREEN);
		setLayout(null);
		textPositionObj = new TextPosition(".");
		textPositionObj.generateDisplay();
		fillArrayLabels();
		
		this.label = new JLabel(text);
		this.add(label);
	}
	public void fillArrayLabels(){
		arrayLabels = new JLabel[textPositionObj.getArray().length];
		for (int i = 0; i < arrayLabels.length; i++) {
			arrayLabels[i] = new JLabel(textPositionObj.getArray()[i].getLetter() +"");
			arrayLabels[i].setBounds(textPositionObj.getArray()[i].getPosX()/2,
														textPositionObj.getArray()[i].getPosY()/2,
														SIZE_LETTER, SIZE_LETTER);
			this.add(arrayLabels[i]);
		}
	}
	public void clean(){
		for (int i = 0; i < arrayLabels.length; i++) {
			remove(arrayLabels[i]);
		}
		this.validate();
	}
	public TextPosition getTextPositionObj() {
		return textPositionObj;
	}
	public JLabel getLabel() {
		return label;
	}
	}