package logic;

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
	public void move(){
		for (int i = 0; i < array.length; i++) {
			array[i].move();
		}
	}

	public void setText(String text) {
		this.text = text;	
		array = new PositionLetter[text.length()];
		
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
