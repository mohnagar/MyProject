
public class DemoIf {

	public static void main(String s[])
	{
		int a,b,c,i,j;
		a=4;
		b=8;
		c=6;
		i=1;
		if (a>b && a>c)
				System.out.println("A");
		//if there is only one statement there is no need braces
				else if (b>c)
					System.out.println("B");
				else
			System.out.println("C");
		
//		if(i==1)
//			j=6;
//		else j=7;		
		j=i==1?6:7;//Ternary operator... replacement of if else..Ternary operator checks
		// the type of both the values and which ever is maximum it will occupy that value.
		System.out.println(j);
	}
}
