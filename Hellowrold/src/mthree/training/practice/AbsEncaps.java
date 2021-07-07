package mthree.training.practice;

abstract class Abs {
	private float totalamount;
	public void setTotalAmount(float totalamount)
	{
		this.totalamount=totalamount;
	}
	public float getTotalAmount()
	{
		return totalamount;
	}
	abstract void withdraw();
	abstract void ministatement();
}
class Abstra extends Abs{
	void withdraw()
	{
		System.out.println("I am withdrawing");
	}
	void ministatement()
	{
		System.out.println("I am taking the ministatement");
	}
}
public class AbsEncaps{
public static void main(String args[])
{
Abs obj=new Abstra();
obj.setTotalAmount(10000);
System.out.println("The total amount that is stored in ATM "+obj.getTotalAmount());
obj.withdraw();
obj.ministatement();
}
}
