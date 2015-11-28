package eclipse;

public class Schleifen 
{
	public static void main(String[] args) 
	{
		for(int i=1; i <=10; i++)
		{
			System.out.println("Durchlauf i " + i);
		}
		for(int j=1;j<=10;j++)
		{
			System.out.println("Durchlauf j " +j);
		}
		//20-90 jede 5te zahl
		for(int c=20;c<=90;c+=5)
		{
			System.out.println("C=" +c);
		}
		//1..100 nur jene die durch 3 teilbar sind und nur bis zur 10. ausgabe
		

		System.out.println("----------------");
		int counter =0;
		for(int z=1; z<=100; z++)
		{
			
			if(z%3==0)
			{
				System.out.println("Z " + z);
				counter++;
			}
			if(counter==10)
			{
				break;
			}
			
		}
		System.out.println("---------------------------");
		//Ausbage aller zahlen 1...1000
		//jene Zahlen die druch 5 Teilbar sind und 40...70 ausschlie0en
		for(int i=1; i<=100; i++)
		{
			
			
			if((i>39 && i<71) || (i%5==0))
			{
				continue;
				
			}
			System.out.println("5te Zahlen " + i);
				
			
		}
	}	

}
