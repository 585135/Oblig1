package oblig1;
 import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
public class Oppgave4 {

	public static void main(String[] args) 
	{
		//deklarasjon
		String input ="";
		double bruttol�nn = 0.0;
		double ereg = 0.0;
		double skatt = 0.0;
		
		
		int t1 = 180800;
		int t2 = 254500;
		int t3 = 639750;
		int t4 = 999550;
		
		
		
		//Innlesing
		input = JOptionPane.showInputDialog("Skriv inn bruttoinntekt ", input);
		
		bruttol�nn = Double.parseDouble(input);
		
		//if
		
		if ( bruttol�nn <= t1)
		{
			JOptionPane.showMessageDialog(null, "Du trenger ikke bekymre deg for trinnskatt");
		}
		else if (bruttol�nn <= t2)
		{
			ereg = bruttol�nn * 0.981;
			skatt = bruttol�nn - ereg;
			JOptionPane.showMessageDialog(null, "Du er p� trinn 1, din l�nn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		else if (bruttol�nn <= t3)
		{
			ereg = bruttol�nn * 0.958;
			skatt = bruttol�nn - ereg;
			JOptionPane.showMessageDialog(null, "Du er p� trinn 2, din l�nn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		else if (bruttol�nn <= t4)
		{
			ereg = bruttol�nn * 0.868;
			skatt = bruttol�nn - ereg;
			JOptionPane.showMessageDialog(null, "Du er p� trinn 3, din l�nn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		else 
		{
			ereg = bruttol�nn * 0.838;
			skatt = bruttol�nn - ereg;
			JOptionPane.showMessageDialog(null, "Du er p� trinn 4, din l�nn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		
		
	}
	
}
