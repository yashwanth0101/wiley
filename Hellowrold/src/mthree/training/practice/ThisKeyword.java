package mthree.training.practice;

public class ThisKeyword {
	int a=5;
	int b=10;
	void check(int a, int b)
	{
		System.out.println("Local:-"+(a+b));
		System.out.println("Instance:-"+(this.a+this.b));
	}
	public static void main(String args[])
	{
		ThisKeyword obj = new ThisKeyword();
		obj.check(12,5);
		
	}

}
