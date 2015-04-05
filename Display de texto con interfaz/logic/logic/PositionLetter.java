package logic;

import javax.swing.JOptionPane;

public class PositionLetter implements Runnable{
	public static final int DEFAULT_LIMIT = 50;
	public static final byte UP_RIGHT = 1;
	public static final byte DOWN_RIGHT = 2;
	public static final byte UP_LEFT = 3;
	public static final byte DOWN_LEFT = 4;
	
	public static int limitX;
	public static int limitY;
	
	private char letter;
	private int posX;
	private int posY;
	private byte orientation;
	
	public PositionLetter(char letter, int posX, int posY) {
		super();
		this.letter = letter;
		this.posX = posX;
		this.posY = posY;
		this.orientation = UP_RIGHT;
		this.limitX = DEFAULT_LIMIT;
		this.limitY = DEFAULT_LIMIT;
	}
	public void move(){
		switch(orientation){
		case UP_RIGHT:
			moveUpRight(); break;
			
		case DOWN_RIGHT:
			moveDownRight(); break;
			
		case UP_LEFT:
			moveUpLeft(); break;
			
		case DOWN_LEFT:
			moveDownLeft(); break;
		}
		
	}
	public void moveUpRight(){
		posX++;
		posY--;
			if (posY < 0) {
				posY= 0;
		orientation = DOWN_RIGHT;
	}
		if (posX > limitX){
			posX = limitX;
			orientation = DOWN_LEFT;
			}
		}
		public void moveUpLeft(){
			posX--;
			posY--;
		if (posX < 0) {
			posX = 0;
		orientation = UP_RIGHT;
		}
		if (posY < 0) {
			posY = 0;
			orientation = DOWN_RIGHT;
			}
		}
		public void moveDownRight(){
			posX++;
			posY++;
			if (posX > limitX){
				posX = limitX;
				orientation = DOWN_LEFT;
		}
		if (posY > limitY){
			posY = limitY;
			orientation = UP_LEFT;
			}
		}
		public void moveDownLeft(){
			posX--;
			posY++;
		if (posX < 0) {
			posX = 0;
			orientation = UP_RIGHT;
		}
		if (posY > limitY){
			posY = limitY;
			orientation = UP_LEFT;
			}
		}
	
	public char getLetter() {
		return letter;
	}


	public void setLetter(char letter) {
		this.letter = letter;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public byte getOrientation() {
		return orientation;
	}


	public void setOrientation(byte orientation) {
		this.orientation = orientation;
	}
	@Override
	public void run() { //main del proceso
		while(true){
		try {
			Thread.sleep(100); // en milisegundos
		} catch (InterruptedException e) {
			JOptionPane.showMessageDialog(null, "algo paso, revisar");
		}
		move();
		System.out.println("hilo en marcha " +letter+ "  "+posX+"  "+ posY);
		}
	}


}
