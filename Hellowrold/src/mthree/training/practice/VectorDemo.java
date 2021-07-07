package mthree.training.practice;

import java.util.*;
public class VectorDemo {
	public static void main(String args[])
	{
		Vector v = new Vector();
		
		v.add("Jonnala");
		v.add("Yashwanth");
		v.add("Kumar");
		v.add("Yashwanth");
		v.add("John");
		v.add(new Integer(1));
		v.add(null);
		
		System.out.println(v);
		
		v.add(3,"Yash");
		v.add(3,"ABC");
		
		System.out.println(v);
		
		System.out.println(v.get(2));
		System.out.println(v.get(4));
		
		System.out.println(v.indexOf("Yashwanth"));
		
		v.remove(6);
		System.out.println(v);
		
		v.remove(new Integer(1));
		System.out.println(v);
		
		ListIterator iter=v.listIterator();
		
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
		
		System.out.println();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
		
	}

}
