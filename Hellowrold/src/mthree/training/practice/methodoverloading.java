package mthree.training.practice;
class Addition{
	void Add(int a, int b)
	{
		System.out.println(a+b);
	}
	void Add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void Add(int a, double b)
	{
		System.out.println(a+b);
	}
}
public class methodoverloading {
	public static void main(String args[])
	{
		Addition obj=new Addition();
		obj.Add(1, 2);
		obj.Add(1, 2.3);
		obj.Add(1, 2, 7);
	}

}
