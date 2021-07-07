package mthree.training.practice;

public class Thiswithcons {
	int a=10;
	int b=5;
	Thiswithcons()
	{
		System.out.println("This is constructor");
	}
	Thiswithcons(int a,int b)
	{
		this();
		System.out.println("Local:-"+(a+b));
		System.out.println("Instance:-"+(this.a+this.b));
	}
public static void main(String args[])
{
Thiswithcons obj = new Thiswithcons(10,10);
}
}
