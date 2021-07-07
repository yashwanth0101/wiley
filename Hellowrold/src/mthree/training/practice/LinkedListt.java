package mthree.training.practice;

import java.util.*;
public class LinkedListt {
	public static void main(String args[])
	{
		LinkedList ls = new LinkedList();
		
		ls.add("Yashwanth");
		ls.add(new Integer(1));
		ls.add(new Character('a'));
		ls.add(null);
		
		System.out.println(ls);
		
		System.out.println(ls.get(2));
		System.out.println(ls.set(1,'x'));
		
		System.out.println(ls);
		
		ls.add(1,"Yash");
		
		System.out.println(ls);
		
		Iterator itr = ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator itr1 = ls.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}

}
