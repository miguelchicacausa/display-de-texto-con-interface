package swing;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import console.ConsoleLetter;
import functional.ALetter;
import functional.Letter;
import functional.Parameters;

public class WindowText extends JFrame{
	private PanelText panelTextObj;
	private PanelStatusBar panelStatusBarObj;
	private PanelArea panelAreaObj;
	private PanelDisplay panelDisplayObj;
	private Events eventsObj;
	
	public WindowText(){
		Image icon = Toolkit.getDefaultToolkit().getImage("F:/eclipse java semestre 4/trifuerza.png");
        setIconImage(icon);
        setVisible(true);
        
		this.eventsObj = new Events(this);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuAbout = new JMenu("Mas");
		menuBar.add(menuAbout);
		
		JMenuItem menuItemAbout = new JMenuItem("Acerca de...");
		menuItemAbout.addActionListener(eventsObj);
		menuItemAbout.setActionCommand(Events.HELP);
		menuAbout.add(menuItemAbout);
		
		this.panelTextObj = new PanelText(eventsObj);
		this.add(panelTextObj, BorderLayout.NORTH);
		
		this.panelStatusBarObj = new PanelStatusBar("Barra de estado");
		this.add(panelStatusBarObj, BorderLayout.SOUTH);
		
		this.panelDisplayObj = new PanelDisplay("");
		this.add(panelDisplayObj, BorderLayout.WEST);
		
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
			//panelDisplayObj.getLabel().setText(temp);
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
	public void letter(){
		this.panelAreaObj.getPanelDisplay().clean();
		String temp = panelTextObj.getBoxText().getText();
		panelAreaObj.getPanelDisplay().getTextPositionObj().setText(temp);
		panelAreaObj.getPanelDisplay().getTextPositionObj().setMaxX(panelAreaObj.getPanelLetter().getX());
		panelAreaObj.getPanelDisplay().getTextPositionObj().setMaxY(panelAreaObj.getPanelLetter().getY());
		panelAreaObj.getPanelDisplay().getTextPositionObj().generateDisplay();
		panelAreaObj.getPanelDisplay().fillArrayLabels();
		
	}
	public void move(){
		panelAreaObj.getPanelLetter().move();
	}
	public void animation(){
		panelAreaObj.getPanelLetter().animation();
	}
	
}