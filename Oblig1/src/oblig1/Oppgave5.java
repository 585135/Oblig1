package oblig1;
import javax.swing.JOptionPane;

public class Oppgave5 {

	public static void main(String[] args) 
	{
		String karakter = "";
		
		int A = 90;
		int B = 80;
		int C = 60;
		int D = 50;
		int E = 40;
		int F = 39;
		boolean T = true;
		
		JOptionPane.showMessageDialog(null, "Skriv inn din poengsum for å få vite karakter ");
		
		
		for (int i = 1; i <= 10; i++)
		{
		try {
			
		karakter = JOptionPane.showInputDialog("Poengsum til elev: " + i, karakter);
		int input = Integer.parseInt(karakter);
		
		while ((input >= 101 || input < 0) && T == true)
		{
			JOptionPane.showMessageDialog(null, "Ugyldig verdi");
			T = false;
		}
		if (input >= 101 || input < 0)
		{
			i--;
		}
			else if (input >= A) 
		 {
			JOptionPane.showMessageDialog(null, "Din karakter: A");
		 }
		else if (input >= B) 
		{
			JOptionPane.showMessageDialog(null, "Din karakter: B");
		}
		else if (input >= C) 
		{
			JOptionPane.showMessageDialog(null, "Din karakter: C");
		}
		else if (input >= D) 
		{
			JOptionPane.showMessageDialog(null, "Din karakter: D");
		}
		else if (input >= E) 
		{
			JOptionPane.showMessageDialog(null, "Din karakter: E");
		}
		else if (input <= F) 
		{
			JOptionPane.showMessageDialog(null, "Din karakter: F");
		}
		
		T = true;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Du må skrive ett heltall.");
			i--;
		}
		
		}
		
	}

}
