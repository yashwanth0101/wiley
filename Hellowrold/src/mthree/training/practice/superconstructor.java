package mthree.training.practice;

class ABCD{
	ABCD()
	{
		System.out.println("This is a constructor of A");
	}
}
public class superconstructor extends ABCD {
	superconstructor()
	{
		super();
		System.out.println("This is a constructor of mainclass");
	}
public static void main(String args[])
{
	superconstructor obj = new superconstructor();
}
}
