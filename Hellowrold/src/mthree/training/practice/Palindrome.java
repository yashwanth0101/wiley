package mthree.training.practice;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		if(s.matches("[0-9]+"))
		{
			int sum=0;
			int p = Integer.parseInt(s);
			int x=p;
			while(p!=0)
			{
			 int r= p%10;
			 sum = (sum*10)+r;
			 p=p/10;
			}
			if(sum == x)
			{
				System.out.println(s+" is a number palindrome");
			}
			else
			{
				System.out.println(s+" is not a number palindrome");
			}
		}
		else
		{
			String s1=s;
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String s2=sb.toString();	
			
			if(s1.equals(s2))
			{
				System.out.println(s+" is a string palindrome");
			}
			else
			{
				System.out.println(s+" is not a string palindrome");
			}
		}

	}

}
