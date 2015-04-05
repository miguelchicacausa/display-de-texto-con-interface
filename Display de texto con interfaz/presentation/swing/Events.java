package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Events implements ActionListener{
	public static final String SEND_LETTER = "Send";
	public static final String LETTER_TEXT = "Letra";
	public static final String MOVE = "Mover";
	public static final String HELP = "Ayuda";
	private WindowText windowTextObj;
	
	public Events(WindowText windowText) {
		windowTextObj = windowText;
	}

	@Override
	public void actionPerformed(ActionEvent act) {
		if(act.getActionCommand().equals(LETTER_TEXT)){
			windowTextObj.letterToLetter();
		}
		if(act.getActionCommand().equals(SEND_LETTER)){
			//windowTextObj.lettersCounters();
			windowTextObj.copyText();
			windowTextObj.letter();
		}
		if(act.getActionCommand().equals(MOVE)){
			windowTextObj.move();
			windowTextObj.animation();
		}
		if(act.getActionCommand().equals(HELP)){
			JOptionPane.showMessageDialog(null, "Universidad Pedagogica y Tecnologica de Colombia" 
					+"\n"+"Facultad de Ingenieria de Sistemas" 
					+"\n" + "Escuela de Ingenieria de Sistemas"
					+"\n" + "Presentado a : " + "Ing. Jairo Botero"
					+"\n" + "Autor: " + "Miguel Angel Chicacausa" 
					+"\n" + "Software Ver 1.0");

		}
	}

}