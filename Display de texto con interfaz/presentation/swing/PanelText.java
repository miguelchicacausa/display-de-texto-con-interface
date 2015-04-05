package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Obtiene el texto ingresado por el usuario
 * @author docente y estudiantes
 *
 */
public class PanelText extends JPanel{
	private JLabel labelText;
	private JTextField textText;
	private JButton buttonLetter;
	private JButton buttonMove;
	private Events eventsObj;
	
	public PanelText(Events events){
		this.eventsObj = events;
		this.setLayout(new FlowLayout());
		
		this.labelText = new JLabel("Texto");
		this.add(labelText);
		
		this.textText = new JTextField(50);//ancho de la caja de texto
		this.add(textText);
		
		this.buttonLetter = new JButton("Letras del texto");
		buttonLetter.addActionListener(eventsObj);
		buttonLetter.setActionCommand(Events.LETTER_TEXT);
		this.add(buttonLetter);
	
		this.buttonMove = new JButton("Animar letras");
		buttonMove.addActionListener(eventsObj);
		buttonMove.setActionCommand(Events.MOVE);
		this.add(buttonMove);
	}
	
	public JTextField getBoxText(){
			return textText;
		}
	}
