package mthree.training.practice;

public class Exceptionhandling {
	public static void main(String args[])
	{
		
		try {
			
		int arr[] = {2,6,8,0,10};
		System.out.println(arr[1]);
		System.out.println(arr[10]);
		System.out.println(arr[3]);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("This is finally block");
		}
}
}
