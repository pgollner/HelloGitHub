package eclipse;

public class vergleichsoperatoren 
{

	public static void main(String[] args) 
	{
		String mystring1 = new String("Der Wagenheber");
		String mystring2 = new String("Der Wagenheber");
		
		boolean sameObject = mystring1 == mystring2; //false weil so nicht die Zeichenkette verglichen wird dafür braucht man equals
		
		boolean sameText =  mystring1.equals(mystring2); //true weil hier der Text verglichen wird
		
		System.out.println("ohne equals: " + sameObject);
		System.out.println("mit equals: " + sameText);
		
		boolean iscaptial = true;
		int inhabitants = 100001;
		double taxPerPersonAndMonth =600.0;
		boolean Metropole = isMetropolis(iscaptial, inhabitants, taxPerPersonAndMonth);
		System.out.println("\nIst die Stadt eine Metropole: " + Metropole);
		// If bedingungen
		int punkte = 75;
		String Note;
		
		if(punkte>90)
		{
			Note = "Sehr Gut";

		}
		else if (punkte > 80)
		{
			Note = "Gut";
		}
		else if (punkte > 70)
		{
			Note = "Befriedigend";
		}
		else if (punkte > 50)
		{
			Note = "Genügend";
		}
		else
		{
			Note = "Nicht Genügend";
		}
		System.out.println("\nNote = " + Note );
	}
	
	public static boolean isMetropolis(boolean iscapital, int inhabitants, double taxPerPersonAndMonth)
	{
		double totaltaxes = taxPerPersonAndMonth * 12 * inhabitants;
		return (iscapital && inhabitants > 100000) || (inhabitants > 200000 && totaltaxes > 720000000);
	
	}
}
