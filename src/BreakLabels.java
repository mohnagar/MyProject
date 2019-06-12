
public class BreakLabels {
	public static void main(String s[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (i==3)
					break; //unlabeled break statement
				System.out.print("* ");

				
			}
			System.out.println();
		}
		mohan:
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (i==3)
					break mohan; //labeled break statement
				System.out.printf("* ");

				
			}
			System.out.println("");
		}
		
		
	}

}
