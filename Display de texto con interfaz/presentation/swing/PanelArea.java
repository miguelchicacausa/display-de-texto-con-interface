package swing;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelArea extends JPanel{
	private PanelDisplay panelDisplay;
	private JButton buttonSendLetter;
	private PanelLetter panelLetter;
	private Events eventsObj;
	
	public PanelArea(Events events){
		this.eventsObj = events;
		this.setLayout(new GridLayout());
		this.panelDisplay = new PanelDisplay("Display");
		this.add(panelDisplay);
		
		this.buttonSendLetter = new JButton("Enviar letras");
		buttonSendLetter.addActionListener(eventsObj);
		buttonSendLetter.setActionCommand(Events.SEND_LETTER);
		this.add(buttonSendLetter);
		
		this.panelLetter = new PanelLetter();
		this.add(panelLetter);
		}
	public PanelLetter getPanelLetter() {
		return panelLetter;
	}
	public PanelDisplay getPanelDisplay() {
		return panelDisplay;
	}
	
}