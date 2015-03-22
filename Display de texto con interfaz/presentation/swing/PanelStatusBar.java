package swing;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelStatusBar extends JPanel{
	private JLabel labelPanel;
	
	public PanelStatusBar(String message){
		this.setBackground(Color.CYAN);
		labelPanel = new JLabel(message);
		this.add(labelPanel);
	}
	public JLabel getLabelPanel() {
		return labelPanel;
	}
}
