package mthree.training.practice;

public class Calculator {
	short a=10,b=7;
	void Add()
	{
		System.out.println(a+b);
	}
	void Substraction()
	{
		System.out.println(a-b);
	}
	void multiplication()
	{
		System.out.println(a*b);
	}
	void Divison()
	{
		System.out.println((float)a/b);
	}
	
public static void main(String args[])
{
	Calculator obj=new Calculator();
	obj.Add();
	obj.Substraction();
	obj.multiplication();
	obj.Divison();
}
}
