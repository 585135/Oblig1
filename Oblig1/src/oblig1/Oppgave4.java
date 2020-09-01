package oblig1;
 import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
public class Oppgave4 {

	public static void main(String[] args) 
	{
		//deklarasjon
		String input ="";
		double bruttolønn = 0.0;
		double ereg = 0.0;
		double skatt = 0.0;
		
		
		int t1 = 180800;
		int t2 = 254500;
		int t3 = 639750;
		int t4 = 999550;
		
		
		
		//Innlesing
		input = JOptionPane.showInputDialog("Skriv inn bruttoinntekt ", input);
		
		bruttolønn = Double.parseDouble(input);
		
		//if
		
		if ( bruttolønn <= t1)
		{
			JOptionPane.showMessageDialog(null, "Du trenger ikke bekymre deg for trinnskatt");
		}
		else if (bruttolønn <= t2)
		{
			ereg = bruttolønn * 0.981;
			skatt = bruttolønn - ereg;
			JOptionPane.showMessageDialog(null, "Du er på trinn 1, din lønn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		else if (bruttolønn <= t3)
		{
			ereg = bruttolønn * 0.958;
			skatt = bruttolønn - ereg;
			JOptionPane.showMessageDialog(null, "Du er på trinn 2, din lønn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		else if (bruttolønn <= t4)
		{
			ereg = bruttolønn * 0.868;
			skatt = bruttolønn - ereg;
			JOptionPane.showMessageDialog(null, "Du er på trinn 3, din lønn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		else 
		{
			ereg = bruttolønn * 0.838;
			skatt = bruttolønn - ereg;
			JOptionPane.showMessageDialog(null, "Du er på trinn 4, din lønn etter skatt er: " + ereg + "\nDu skatter: " + skatt);
			
		}
		
		
	}
	
}
