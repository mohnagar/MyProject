

// If system does not find the exact number of arguments then it will go for Var Args


public class Varargs {
	
	public static void main(String[] args)
	{
		Display obj = new Display();
		obj.show(5,6,7,9);
	}
}
	
class Display
	{
		public void show(int ... a)// Variable arguments is used when we dont know the user input
		{
		for (int i : a)
		{
			System.out.println(i);
		}
		}
		
		public void show(int x,int y,int z)
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
