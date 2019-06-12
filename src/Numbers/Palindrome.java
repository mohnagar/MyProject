package Numbers;

public class Palindrome {
	
	public static void main(String[] args)
	{
		int n=120,r,s=0;
		int t=n;
		
		while (n>0)
		{
			r=n%10; // remainder
			n=n/10; // breakdown the number
			s=s*10+r; // increase the status
						
		}
		if (t==s)
					System.out.println("Palindrome");
		else
		
			System.out.println("Not a palindrome");
		
	}

}
