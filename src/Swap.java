
public class Swap {

		public static void main(String[] args)
	{
		int a=4;
		int b=5;
		//int temp;
		
		/* This take more bytes as we are using one more extra variable.
		 *	temp =a;
			a=b;
			b=temp; 
		 */
		
		/*
		 * 	a=a+b; // 9 --> 1001 -> This takes more space
	 		b=a-b; // 4
			a=a-b; // 5
		 */	
		
		//a=a^b;// 1 0 0 XOR 1 0 1 --> 0 0 1
		//b=a^b;// 0 0 1 XOR 1 0 1 --> 1 0 0
		//a=a^b;// 0 0 1 XOR 1 0 0 --> 1 0 1
		
		//System.out.println("a : " +a);
		//System.out.println("b : " +b);
		
		 b = a+b-(a=b);
		 System.out.println(a+ " " +b);
		 
	}
	
}
