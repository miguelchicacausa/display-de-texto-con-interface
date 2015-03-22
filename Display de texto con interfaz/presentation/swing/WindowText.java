package swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowText extends JFrame{
	private PanelText panelTextObj;
	private PanelStatusBar panelStatusBarObj;
	private PanelArea panelAreaObj;
	private Events eventsObj;
	
	public WindowText(){
		this.eventsObj = new Events(this);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.panelTextObj = new PanelText(eventsObj);
		this.add(panelTextObj, BorderLayout.NORTH);
		
		this.panelStatusBarObj = new PanelStatusBar("Barra de estado");
		this.add(panelStatusBarObj, BorderLayout.SOUTH);
		
		this.panelAreaObj = new PanelArea(eventsObj);
		this.add(panelAreaObj, BorderLayout.CENTER);
		
		this.setSize(1000, 600);
		//this.pack();
	}
	public void copyText(){
		String temp = panelTextObj.getBoxText().getText();
		if(temp.equals(" ")){
			JOptionPane.showMessageDialog(null, "Ingreso en blanco");
		}else{
			panelStatusBarObj.getLabelPanel().setText(temp);
		}
	}
	public void lettersCounters(){
		String temp = panelTextObj.getBoxText().getText();
		if(temp.equals(" ")){
			JOptionPane.showMessageDialog(null, "Ingreso en blanco");
		}else{
		JOptionPane.showMessageDialog(null, "Texto recibido: " + temp);
		}
	}
	public void letterToLetter(){
		this.panelAreaObj.getPanelLetter().clean();
		String temp = panelTextObj.getBoxText().getText();
		panelAreaObj.getPanelLetter().getTextPositionObj().setText(temp);
		panelAreaObj.getPanelLetter().getTextPositionObj().setMaxX(panelAreaObj.getPanelLetter().getX());
		panelAreaObj.getPanelLetter().getTextPositionObj().setMaxY(panelAreaObj.getPanelLetter().getY());
		panelAreaObj.getPanelLetter().getTextPositionObj().generate();
		panelAreaObj.getPanelLetter().fillArrayLabels();
	}
	public void move(){
		panelAreaObj.getPanelLetter().move();
	}
	public void animation(){
		panelAreaObj.getPanelLetter().animation();
	}
	
}
