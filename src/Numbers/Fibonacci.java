package Numbers;

public class Fibonacci {
	/*
	Need to check by inputting the value by the user
	*/

	public static void main(String[] args)
	{
		int k,a=1,b=1;
		System.out.print("1 1 ");
		for(k=0;k<=200;k++)
		{
			k=a+b;
			if(k>=200)
				break;
			System.out.print(k + " ");
			a=b;
			b=k;
			
		}
				
		
	}
	
	
}
