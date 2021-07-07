package mthree.training.practice;
class AB{
	void m1()
	{
		System.out.println("I am m1");
	}
}
public class supermethods extends AB{
	void m1()
	{
		super.m1();
		System.out.println("I am m2");
	}

public static void main(String args[])
{
	supermethods obj=new supermethods();
	obj.m1();
}
}
