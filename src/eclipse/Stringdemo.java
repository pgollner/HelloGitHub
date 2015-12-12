package eclipse;

public class Stringdemo 
{
	public static void main(String[] args) {
		String a = "das";
		String b = "das";
		
		if (a.equals(b))
		{
			System.out.println(a + ", " + b + " are equal");
		}
		else 
		{
			System.out.println(a + ", " + b + " are not equal");
		}
		
		a = a + " test";
		b = b + " Test";
		
		if (a.equals(b))
		{
			System.out.println(a + ", " + b + " are equal");
		}
		else 
		{
			System.out.println(a + ", " + b + " are not equal");
		}
		
		if (a.equalsIgnoreCase(b))
		{
			System.out.println("IC: " + a + ", " + b + " are equal");
		}
		else 
		{
			System.out.println("IC: " + a + ", " + b + " are not equal");
		}
		
		String name1 = "Hans";
		String name2 = "Hansi";
		
		String name3 = name1.concat(name2);
		System.out.println(name3);
		
		
		if (name1.compareTo(name2)> 0)
		{
			System.out.println(name1 + " steht im Woerterbuch hinter " + name2);
		}
		else
		{
			System.out.println(name1 + " steht im Woerterbuch vor " + name2);
		}

		System.out.println(name1.charAt(3));
		System.out.println(name1.length());
		
		char c = name1.charAt(3);
		System.out.println(c);
		
		String name4 = name2 + c;
		System.out.println(name2);
	
		
	}

}
