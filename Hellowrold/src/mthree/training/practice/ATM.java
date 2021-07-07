package mthree.training.practice;
import java.util.*;
public class ATM {
	Scanner sc=new Scanner(System.in);
    public boolean name()
    {
        System.out.println("Enter the name");
        String name= sc.nextLine();
        int c=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i) == ' ')
            {
            c++;
            }
        }
        if(c>2)
        {
            System.out.println("Your name has more than two spaces!! Please enter the correct name");
            return true;
        }
        return false;
        /*
        String names[]=name.split(" ");
        if(names.length > 3)
        {
        System.out.println("Your name has more than two spaces!! Please enter the correct name!");
        return true;
        }
        return false;*/
    }
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Create 2. Display 3. Raise salary 4. Exit");
        int n=sc.nextInt();
        sc.nextLine();
        switch(n)
        {
            case 1:
            ATM obj=new ATM();
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
        System.out.println("Enter designation");
        String desig=sc.nextLine();
        break;
            case 2:
            case 3:
            case 4:
        }
    }
}
