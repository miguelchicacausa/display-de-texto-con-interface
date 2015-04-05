package console;
/**
 *Universidad Pedagogica y Tecnologica de Colombia UPTC
 *Facultad de Ingenieria 
 *Ingenieria de sistemas y computacion
 *Materia : Programacion II  
 * Docente: Ing. Jairo Botero  
 * 
 * @author Miguel Angel Chicacausa Garzon cod: 201321840
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

import functional.ALetter;
import functional.BLetter;
import functional.CLetter;
import functional.DLetter;
import functional.ELetter;
import functional.FLetter;
import functional.GLetter;
import functional.HLetter;
import functional.ILetter;
import functional.JLetter;
import functional.KLetter;
import functional.LLetter;
import functional.Letter;
import functional.MLetter;
import functional.NLetter;
import functional.OLetter;
import functional.PLetter;
import functional.Parameters;
import functional.QLetter;
import functional.RLetter;
import functional.SLetter;
import functional.TLetter;
import functional.ULetter;
import functional.VLetter;
import functional.WLetter;
import functional.XLetter;
import functional.YLetter;
import functional.ZLetter;
import functional.ÑLetter;

public class Display {

	public static void main(String[] args) {
		char letter = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese el texto: ");
		String text = reader.nextLine();
		System.out.println("Ingrese altura del texto: ");
		int height = reader.nextInt();
		System.out.println("Ingrese el ancho del texto: ");
		int width = reader.nextInt();
		System.out.println("El texto ingresado es " + text);
		text = text.toUpperCase();
		System.out.println("Texto en mayusculas: " + text);
		for (char i = 0; i < text.length(); i++) {
			letter = text.charAt(i);
			System.out.println("hey --"+text.charAt(0));
			if(letter == 'A'){
				Parameters parametersObjA = new Parameters(height, width, '*');
				Letter letterObjA = new ALetter(parametersObjA);
				letterObjA.generate();
				ConsoleLetter.print(letterObjA);
			}
			if(letter == 'B'){
				Parameters parametersObjB = new Parameters(height, width, '*');
				Letter letterObjB = new BLetter(parametersObjB);
				letterObjB.generate();
				ConsoleLetter.print(letterObjB); 
			}
			if(letter == 'C'){
				Parameters parametersObjC = new Parameters(height, width, '*');
				Letter letterObjC = new CLetter(parametersObjC);
				letterObjC.generate();
				ConsoleLetter.print(letterObjC);
			}
			if(letter == 'D'){
				Parameters parametersObjD = new Parameters(height, width, '*');
				Letter letterObjD = new DLetter(parametersObjD);
				letterObjD.generate();
				ConsoleLetter.print(letterObjD);
			}
			if(letter == 'E'){
				Parameters parametersObjE = new Parameters(height, width, '*');
				Letter letterObjE = new ELetter(parametersObjE);
				letterObjE.generate();
				ConsoleLetter.print(letterObjE);
			}
			if(letter == 'F'){
				Parameters parametersObjF = new Parameters(height, width, '*');
				Letter letterObjF = new FLetter(parametersObjF);
				letterObjF.generate();
				ConsoleLetter.print(letterObjF);
			}
			if(letter == 'G'){
				Parameters parametersObjG = new Parameters(height, width, '*');
				Letter letterObjG = new GLetter(parametersObjG);
				letterObjG.generate();
				ConsoleLetter.print(letterObjG);
			}
			if(letter == 'H'){
				Parameters parametersObjH = new Parameters(height, width, '*');
				Letter letterObjH = new HLetter(parametersObjH);
				letterObjH.generate();
				ConsoleLetter.print(letterObjH);
			}
			if(letter == 'I'){
				Parameters parametersObjI = new Parameters(height, width, '*');
				Letter letterObjI = new ILetter(parametersObjI);
				letterObjI.generate();
				ConsoleLetter.print(letterObjI);
			}
			if(letter == 'J'){
				Parameters parametersObjJ = new Parameters(height, width, '*');
				Letter letterObjJ = new JLetter(parametersObjJ);
				letterObjJ.generate();
				ConsoleLetter.print(letterObjJ);
			}
			if(letter == 'K'){
				Parameters parametersObjK = new Parameters(height, width, '*');
				Letter letterObjK = new KLetter(parametersObjK);
				letterObjK.generate();
				ConsoleLetter.print(letterObjK);
			}
			if(letter == 'L'){
				Parameters parametersObjL = new Parameters(height, width, '*');
				Letter letterObjL = new LLetter(parametersObjL);
				letterObjL.generate();
				ConsoleLetter.print(letterObjL);
			}
			if(letter == 'M'){
				Parameters parametersObjM = new Parameters(height, width, '*');
				Letter letterObjM = new MLetter(parametersObjM);
				letterObjM.generate();
				ConsoleLetter.print(letterObjM);
			}
			if(letter == 'N'){
				Parameters parametersObjN = new Parameters(height, width, '*');
				Letter letterObjN = new NLetter(parametersObjN);
				letterObjN.generate();
				ConsoleLetter.print(letterObjN);
			}
			if(letter == 'Ñ'){
				Parameters parametersObjÑ = new Parameters(height, width, '*');
				Letter letterObjÑ = new ÑLetter(parametersObjÑ);
				letterObjÑ.generate();
				ConsoleLetter.print(letterObjÑ);
			}
			if(letter == 'O'){
				Parameters parametersObjO = new Parameters(height, width, '*');
				Letter letterObjO = new OLetter(parametersObjO);
				letterObjO.generate();
				ConsoleLetter.print(letterObjO);
			}
			if(letter == 'P'){
				Parameters parametersObjP = new Parameters(height, width, '*');
				Letter letterObjP = new PLetter(parametersObjP);
				letterObjP.generate();
				ConsoleLetter.print(letterObjP);
			}
			if(letter == 'Q'){
				Parameters parametersObjQ = new Parameters(height, width, '*');
				Letter letterObjQ = new QLetter(parametersObjQ);
				letterObjQ.generate();
				ConsoleLetter.print(letterObjQ);
			}
			if(letter == 'R'){
				Parameters parametersObjR = new Parameters(height, width, '*');
				Letter letterObjR = new RLetter(parametersObjR);
				letterObjR.generate();
				ConsoleLetter.print(letterObjR);
			}
			if(letter == 'S'){
				Parameters parametersObjS = new Parameters(height, width, '*');
				Letter letterObjS = new SLetter(parametersObjS);
				letterObjS.generate();
				ConsoleLetter.print(letterObjS);
			}
			if(letter == 'T'){
				Parameters parametersObjT = new Parameters(height, width, '*');
				Letter letterObjT = new TLetter(parametersObjT);
				letterObjT.generate();
				ConsoleLetter.print(letterObjT);
			}
			if(letter == 'U'){
				Parameters parametersObjU = new Parameters(height, width, '*');
				Letter letterObjU = new ULetter(parametersObjU);
				letterObjU.generate();
				ConsoleLetter.print(letterObjU);
			}
			if(letter == 'V'){
				Parameters parametersObjV = new Parameters(height, width, '*');
				Letter letterObjV = new VLetter(parametersObjV);
				letterObjV.generate();
				ConsoleLetter.print(letterObjV);
			}
			if(letter == 'W'){
				Parameters parametersObjW = new Parameters(height, width, '*');
				Letter letterObjW = new WLetter(parametersObjW);
				letterObjW.generate();
				ConsoleLetter.print(letterObjW);
			}
			if(letter == 'X'){
				Parameters parametersObjX = new Parameters(height, width, '*');
				Letter letterObjX = new XLetter(parametersObjX);
				letterObjX.generate();
				ConsoleLetter.print(letterObjX);
			}
			if(letter == 'Y'){
				Parameters parametersObjY =new Parameters(height, width, '*');
				Letter letterObjY = new YLetter(parametersObjY);
				letterObjY.generate();
				ConsoleLetter.print(letterObjY);
			}
			if(letter == 'Z'){
				Parameters parametersObjZ = new Parameters(height, width, '*');
				Letter letterObjZ = new ZLetter(parametersObjZ);
				letterObjZ.generate();
				ConsoleLetter.print(letterObjZ);
			}
		}
	}
}