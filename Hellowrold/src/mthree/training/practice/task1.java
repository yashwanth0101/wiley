package mthree.training.practice;
import java.util.*;
public class task1 {
int id;
String name;
task1(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println("Id is:-"+id);
System.out.println("Name is:-"+name);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the id:-");
int id=sc.nextInt();sc.nextLine();
System.out.println("Please enter the name:-");
String name=sc.nextLine();
task1 obj=new task1(id,name);
obj.display();
}
}
