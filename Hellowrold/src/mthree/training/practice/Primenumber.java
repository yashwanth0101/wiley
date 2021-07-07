package mthree.training.practice;

public class Primenumber {
public static void main(String args[]) {
	int n=27;
	for(int j=2;j<30;j++)
	{
		int c=0;
	for(int i=1;i<Math.sqrt(n);i++)
	{
		if(j%i == 0)
		{
			c++;
		}
	}
	if(c == 0)
	{
		System.out.println(j);
	}
	}
}
}
