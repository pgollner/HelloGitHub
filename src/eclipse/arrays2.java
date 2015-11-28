package eclipse;

public class arrays2 {

	public static void main(String[] args) 
	{
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
		int erg8=0;
		
		
		for(int i=0;i<numbers3.length;i++)
		{
			erg8+=numbers3[i];
		
		}
		System.out.println(erg8);

	}

}
