package Patterns;

public class Patterns {

	public static void main(String[] args)
	
	{
		int i,j,k;
		//for(i= 1;i<=4;i++)
		//{
			//for(j=1;j<=i;j++)
			//{
				//System.out.print("* ");
			//}
			//System.out.println();
		//}
		
		//for(i= 1;i<=4;i++)
		//{
			//for(j=1;j<=4;j++)
			//{
				//if (i==1 || i==4 || j==1 || j==4 )
					//System.out.print("* ");
				//else
					//System.out.print("  ");	
			//}
			//System.out.println();
		//}
		
		for(i=0;i<4;i++)
		{
			for(j=i; j<i+4 ;j++)
			{
				
				System.out.print((j%4)+1);	
						
			}
			System.out.println("");
									
		}
		
	}
		
}
