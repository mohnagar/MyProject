package Arrays;
import java.util.Random;

public class SingleArray {
	
	public static void main(String[] args)
	{
		int a[]= new int[50];// In Java we have create a object for array
/*
 * 		a[1]=5;
		a[2]=7;		
 * 		a[0]=2;
 */
		Random r = new Random();//Random class belongs to package java.util
		for (int i =0;i<a.length;i++)
		{
			a[i]=r.nextInt(50);
		}
		
		System.out.println(a[14]);
		//for(int i=0;i<3;i++)
			//System.out.println(a[i]);
		
		// to handle arrayIndexOutOfBound exception
		try{
		
			System.out.println(a[53]);
		}
		catch(ArrayIndexOutOfBoundsException e)// catch (Exception e)
		{
			System.out.println("Maximum array index is 49");
		}
		
		
		for(int i : a) //enhanced for loop
			System.out.println(i);
			
	}

}
