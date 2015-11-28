package eclipse;

public class CharArray 
{
	private char[] charArray;
	public CharArray(char[] charArray)
	{
		this.charArray=charArray;
	}

	public void print()
	{
		for (int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		System.out.println();
	}
	public void print(int start, int ende)
	{
		if(ende>charArray.length)
		{
			ende = charArray.length;
		}
		for (int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		System.out.println();
	}
	
}

