package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Events implements ActionListener{
	public static final String SEND_LETTER = "Send";
	public static final String LETTER_TEXT = "Letra";
	public static final String MOVE = "Mover";
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
			windowTextObj.lettersCounters();
		}
		if(act.getActionCommand().equals(MOVE)){
			windowTextObj.move();
		}
	}

}
