
// enhanced for loop for 2D array

public class EnhancedFor {

	public static void main(String[] args)
	{
		//int a=5,b=6,c=7,d=8;
		//int x[] = {5,6,7,8};
		//int y[] = {6,7,8,9};
		//int z[] = {7,8,9,10};
		
		int p[][]={
					{5,6,7,8},
					{6,7,8,9},
					{7,8,9,10}
				};
		
		for (int i[] : p)
		{
			for(int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(p[i][j] + " ");
			}
				System.out.println();
		}
		*/	
	}

	
}
