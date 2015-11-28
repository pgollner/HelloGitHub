package eclipse;

public class arrays {

	public static void main(String[] args) 
	{
		int[] numbers1 = new int[3];
		numbers1[0] = 1;
		numbers1[1] = 3;
		numbers1[2] = 5;
		
		int[] numbers2 = new int[3];
		numbers2[0] = 2;
		numbers2[1] = 4;
		numbers2[2] = 5;
		
		
		int erg1, erg2, erg3, erg4, erg5, erg6;

		erg1=numbers1[0] + numbers2[0];
		erg2=numbers1[1] + numbers2[1];
		erg3=numbers1[2] + numbers2[2];
		erg4=numbers1[0] * numbers2[0];
		erg5=numbers1[1] * numbers2[1];
		erg6=numbers1[2] * numbers2[2];
		System.out.println("+ " + erg1 + ", " + erg2 + ", " + erg3 );
		System.out.println("* " + erg4 + ", " + erg5 + ", " + erg6 );
		System.out.println("---------------------------------" );
		
		
		
		
		for(int i=0;i<numbers1.length;i++)
		{
			System.out.println(numbers1[i]+numbers2[1]);
			System.out.println(numbers1[i]*numbers2[1]);
		}
		
		System.out.println("---------------------------------" );
		
		String[] tage = {"Mo","Di","Mi","Do","Fr","Sa","So"}; //Literale Initialisierung
		for(int i=0;i<tage.length;i++)
		{
			System.out.println(tage[i]);

		}
		System.out.println("---------------------------------" );
		
		int[] numbers3 = new int[10];
		numbers3[0] = 1;
		numbers3[1] = 3;
		numbers3[2] = 5;
		numbers3[3] = 7;
		numbers3[4] = 9;
		numbers3[5] = 11;
		numbers3[6] = 13;
		numbers3[7] = 15;
		numbers3[8] = 17;
		numbers3[9] = 20;
		int erg7 = 0;
		boolean contains;
		for(int i=0;i<numbers3.length;i++)
		{
			erg7+=numbers3[i];
		
		}
		System.out.println(erg7);
		String janein;
		contains = containsNumber(numbers3, 10);
		if(contains==true)
		{ 
			janein = "Ja"; 
		}
		else
		{
			janein = "Nein";
		}
		System.out.println("Ist die Zahl 7 enthalten? " + janein   );
		
		System.out.println("---------------------------------" );
		
		int[] numbers4 = new int[10];
		numbers4[0] = 1;
		numbers4[1] = 3;
		numbers4[2] = 5;
		numbers4[3] = 7;
		numbers4[4] = 9;
		numbers4[5] = 11;
		numbers4[6] = 13;
		numbers4[7] = 15;
		numbers4[8] = 17;
		numbers4[9] = 20;
		
		int[] numbers5 = new int[10];
		numbers5[0] = 1;
		numbers5[1] = 3;
		numbers5[2] = 5;
		numbers5[3] = 7;
		numbers5[4] = 9;
		numbers5[5] = 11;
		numbers5[6] = 13;
		numbers5[7] = 15;
		numbers5[8] = 17;
		numbers5[9] = 20;
		
		int erg8 = 0;
		
		
		
		for(int i=0;i<numbers5.length;i++)
		{
			erg8+=numbers4[i];
			erg8+=numbers5[i];
		}
		
		System.out.println(erg8);
		System.out.println("---------------------------------" );
		
		int S=1;
		int Z=1;
		int[][] a = {{3,4,5},{6,7,8}};
		
		for(int i = 0; i<a.length ;i++)
		{
			for(int j = 0; j<a[i].length;j++)
			{
				System.out.println("Spalte["+S+"], Zeile["+Z+"]: "+a[i][j]);
				Z++;
			}
			Z=1;
			S++;
		
		}
	
	}

	public static boolean containsNumber(int[] numbers, int n)
	{
		for(int j=0;j<numbers.length;j++)
		{
			if(n==numbers[j])
			{
				return true;
			}
		}
		
		return false;
	}
	
}
