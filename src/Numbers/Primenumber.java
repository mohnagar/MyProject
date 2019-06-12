package Numbers;

public class Primenumber {
	
	public static void main(String[] args)
	{
		int num = 25;
		boolean isPrime = true;
		
		//for (int i=2;i<=num/2;i++) --> faster way .. since we can stop checking for num/2
		//for (int i=2;i<=num;i++)
			for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(num + " is a prime number" );
		System.out.println(num + " is not a prime number");
	}

}
