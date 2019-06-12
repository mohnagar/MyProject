package Numbers;

public class PerfectNumber {
	
	// 6 -> 1 + 2 + 3 = 6
	// 28 -> 1 + 2 + 4 + 7 + 14 = 28

	public static void main(String[] args)
	{
		int n = 6;
		boolean b = isPerfect(n);
		if(b)
			System.out.println(n + " " + "Is a perfect number");
		else
			System.out.println("It's not");
		
	}
	
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for (int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(n==sum)
			return true;
		return false;
	}
	
	
	
}
