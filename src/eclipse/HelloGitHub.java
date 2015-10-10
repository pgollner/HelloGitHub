package eclipse;

public class HelloGitHub 
{

	public static void main(String[] args) 
	{
		// variablen anlegen
		boolean treeFront = true; // booleanvariable angelegt mit Ausgangswert
		String text = "Baumvoraus";		//String ist immer groﬂ zu schreiben
		int numberleafes = 0; // intvariable angelegt mit Ausgangswert 0
		char meinZeichen = 'X';

		// Ausgabe als Text; ohne "ln" g‰be es keinen Zeilenumbruch

		System.out.println("Ist baum voraus? " + treeFront);
		System.out.println("Anzahl Bl‰tter: " + numberleafes);
		System.out.println();																	//leerzeile
		System.out.println("Anzahl Bl‰tter: " + numberleafes + "\n" + "Baum voraus " + treeFront);
		System.out.println(meinZeichen);
		
	}
}
