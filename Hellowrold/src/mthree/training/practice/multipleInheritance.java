package mthree.training.practice;

class A{
	void display()
	{
		System.out.println("Iam A");
	}
}
class B{
	void display()
	{
		System.out.println("Iam B");
	}
}
class C extends A,B{
	void show()
	{
		System.out.println("Iam Show");
	}
}

public class multipleInheritance {
public static void main(String args[])
{
	C obj = new C();
	obj.show();
	obj.display();
}
}
