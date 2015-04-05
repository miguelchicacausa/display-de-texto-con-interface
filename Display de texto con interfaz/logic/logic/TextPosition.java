package logic;

import console.ConsoleLetter;
import functional.ALetter;
import functional.Letter;
import functional.Parameters;

public class TextPosition {
	public static final int LIMIT = 200;
	private String text;
	private PositionLetter[] array;
	private int maxX;
	private int maxY;

	public TextPosition(String text) {
		setText(text);
		this.maxX = LIMIT;
		this.maxY = LIMIT;
	}
	
	public TextPosition(String text, int maxX, int maxY) {
		setText(text);
		this.maxX = LIMIT;
		this.maxY = LIMIT;
		array = new PositionLetter[text.length()];
	}

	public PositionLetter[] getArray() {
		return array;
	}

	public void setArray(PositionLetter[] array) {
		this.array = array;
	}
	/**
	 * toma las letras y las pasa a un arreglo con coordenadas
	 */
	public void generate(){
		 for (int i = 0; i < array.length; i++) {
			array[i] = new PositionLetter(text.charAt(i), (int)(Math.random()*maxX), (int)(Math.random()*maxY));
		}
	}
	public void generateDisplay(){
		Parameters parametersObjA = new Parameters(5, 5, '*');
		Letter letterObjA = new ALetter(parametersObjA);
		for (int i = 0; i < array.length;i++) {
				array[i] = new PositionLetter(text.charAt(0), maxX/2, maxY/2);
				letterObjA.generate();
				ConsoleLetter.print(letterObjA);
		}
	}
	public void move(){
		for (int i = 0; i < array.length; i++) {
			array[i].move();
		}
	}

	public void setText(String t) {
		this.text = t;	
		array = new PositionLetter[t.length()];
		
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

}