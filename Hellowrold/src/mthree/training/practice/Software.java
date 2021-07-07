package mthree.training.practice;

import java.util.*;
public class Software {
Scanner sc=new  Scanner(System.in);
int c=0;
void create()
{
	while(true)
	{
	Software obj=new Software();
	while(true)
    {
        boolean b=obj.name();
        if(b)
        {
            continue;
        }
        else
        {
            break;
        }
    }
	System.out.println("Enter the age");
	int age=sc.nextInt();sc.nextLine();
	obj.desig();
	}
}
	void desig()
	{
	System.out.println("Enter the designation");
	String designation = sc.nextLine();
	if(designation.equalsIgnoreCase("Programmer") || designation.equalsIgnoreCase("Manager") || designation.equalsIgnoreCase("Tester"))
	{
		System.out.println("Do you want to continue");
		System.out.println("Y/N");
		char ch=sc.next().charAt(0);
		if(ch == 'Y')
		{
			Software obj=new Software();
			obj.create();
		}
		else
		{
		Software obj=new Software();
		obj.input();
		System.exit(9);
		}
	}
	else
	{
		System.out.println("Wrong input! Please enter the correct designation");
		Software obj=new Software();
		obj.desig();
	}
	}
	public boolean name()
    {
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		int x=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i) == ' ')
            {
            x++;
            }
        }
        if(x>2)
        {
            System.out.println("Your name has more than two spaces!! Please enter the correct name");
            return true;
        }
        return false;
    }
	void input()
	{
		Scanner sc=new Scanner(System.in);
		Software obj=new Software();
		System.out.println("1.create 2. display 3. Raise Salary 4.Exit");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				obj.create();
			case 2:
			case 3:
			case 4:

		}
	}
	
public static void main(String args[])
{
Software obj=new Software();
obj.input();
}
}
