package mthree.training.practice;

import java.util.*;
public class Employee {
	Scanner sc=new Scanner(System.in);
	ArrayList arr1 = new ArrayList();
	ArrayList arr2 = new ArrayList();
	ArrayList arr3 = new ArrayList();
	ArrayList arr4 = new ArrayList();
	ArrayList arr5 = new ArrayList();
	int flag=0;
	int fla=0;
	int f=0;
	int fff=0;
	int salary=0;
	
void create()
{
	flag++;
	name();
	age();
	desig();
	input();
}

void name()
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
        name();
    }
    else
    {
    arr1.add(name);
    }
}

void age()
{
	System.out.println("Enter the age (only between 18 and 60):");
	String s=sc.nextLine();
	if(s.matches("[0-9]+"))
	{
	int age = Integer.parseInt(s);
	if(age<18 || age > 60)
	{
		System.out.println("Please enter the valid age");
		age();
	}
	else
	{
		arr2.add(age);
	}
	}
	else
	{
		System.out.println("Please enter the age in correct format!!");
		age();
	}
}

void desig()
{
	System.out.println("Enter the designation");
	String designation = sc.nextLine();
	if(designation.equalsIgnoreCase("Programmer") || designation.equalsIgnoreCase("Manager") || designation.equalsIgnoreCase("Tester"))
	{
		if(designation.equalsIgnoreCase("Programmer"))
		{
			salary=30000;
			arr4.add(salary);
		}
		else if(designation.equalsIgnoreCase("Manager"))
		{
			salary=35000;
			arr4.add(salary);
		}
		else if(designation.equalsIgnoreCase("Tester"))
		{
			salary=25000;
			arr4.add(salary);
		}
		
		System.out.println("Do you want to continue");
		System.out.println("Y/N");
		char ch=sc.next().charAt(0);sc.nextLine();
		if(ch == 'Y')
		{	
			arr3.add(designation);
			f = arr1.size();
		    if(f>0)
		    {
		    	empid(f);
		    }
		    if(f == 3)
		    {
		    	System.out.println("Limit exceeded");
		    	input();
		    }
			create();
		}
		else if(ch == 'N')
		{
		empid(++f);
		arr3.add(designation);
		input();
		}
	}
	else
	{
		System.out.println("Wrong input! Please enter the correct designation");
		desig();
	}
}

void rs(int i)
{
	System.out.println("Enter the percentage of salary to be raised (MAX 30%)");
	float inc = sc.nextFloat();sc.nextLine();
	if(inc <= 30)
	{
		int y=0;
		Object obj=arr4.get(i);
		if(obj instanceof Integer)
		{
			 y = (int) obj;
		}
		arr4.set(i, y+(inc/100)*y);
		
	System.out.println("Salary of an employee got incremented successfully!!");
	input();
	}
	else
	{
		System.out.println("Please enter the valid percentage of salary hike");
		rs(i);
	}
}

void raisesalary()
{
	fff++;
	System.out.println("Enter the employee id for whom the salary should be raised");
	String s=sc.nextLine();
	int z=0;
	for(int i=0;i<arr5.size();i++)
	{
		if(s.equals(arr5.get(i)))
		{
			z++;
			rs(i);
		}
	}
	if(z == 0)
	{
		System.out.println("Please enter the valid employee id");
		raisesalary();
	}
}

void empid(int f)
{
	String s="WIL"+(f);
	arr5.add(s);
}

void delete()
{
	System.out.println("Enter the employee id, for whom you want to delete");
	String eid= sc.nextLine();
	int m=0;
	for(int i=0;i<arr5.size();i++)
	{
		if(arr5.get(i) .equals(eid))
		{
			m++;
			arr5.remove(i);
			arr4.remove(i);
			arr3.remove(i);
			arr2.remove(i);
			arr1.remove(i);
		}
	}
if(m == 0)
{
	System.out.println("Please enter the valid employee id");
	delete();
}
else
{
System.out.println("Deltails of an employee got deleted successfully!!!");
input();
}
}
void input()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("1.create 2. display 3. Raise Salary 4. Delete 5. Exit");
	int n=sc.nextInt();sc.nextLine();
	switch(n)
	{
		case 1:
			create();
			break;
		case 2:
			if(flag == 0)
			{
				System.out.println("You can't display the details without creating");
				input();
			}
			display();
			break;
		case 3:
			if(flag == 0 || fla == 0)
			{
				System.out.println("You can't raise the salary without creating or displaying");
				input();
			}
			raisesalary();
			break;
		case 4:
			if(flag ==0 || fla == 0 || fff == 0)
			{
				System.out.println("You can't delete before creating or displaying or raising");
				input();
			}
			delete();
			break;
		case 5:
			System.out.println("Thank you for visiting!!!");
			System.exit(9);
			break;
		default:
			System.out.println("Please enter the correct input!");
			input();
}
}

void display()
{
	fla++;
	for(int i=0;i<arr1.size();i++)
	{
			System.out.println("The details of "+(i+1)+" member:-");
			System.out.println("Name:-"+arr1.get(i));
			System.out.println("Age:-"+arr2.get(i));
			System.out.println("Designation:-"+arr3.get(i));
			System.out.println("Salary:-"+arr4.get(i));
			System.out.println("Employee id:-"+arr5.get(i));
			System.out.println("------------------------");
	}
input();
}

public static void main(String args[])
{
Employee obj = new Employee();
obj.input();
}
}
