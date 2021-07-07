package mthree.training.practice;
interface I1{
	void display();
}
interface I2{
	void display();
}
class Mul implements I1,I2{
public void display()
{
System.out.println("I am displaying the method");	
}
}
public class multipleinheritancei {
public static void main(String args[])
{
Mul obj = new Mul();
obj.display();
}
}
