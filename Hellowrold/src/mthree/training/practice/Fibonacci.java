package mthree.training.practice;

public class Fibonacci {
void Fibo(int n)
{
int f1=0;
int f2=1;
System.out.print(f1+" "+f2+" ");
int f3;
for(int i=2;i<n;i++)
{
f3=f1+f2;
System.out.print(f3+" ");
f1=f2;
f2=f3;
}
}
public static void main(String args[])
{
Fibonacci obj=new Fibonacci();
obj.Fibo(10);
}
}
