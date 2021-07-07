package mthree.training.practice;

import java.util.*;
public class LList {
public static void main(String args[])
{
	LinkedList llist = new LinkedList();
	llist.add(7);
	llist.add(10);
	llist.add("Yashwanth");
	
	System.out.println(llist.get(2));

	System.out.println(llist);

	Iterator iter = llist.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
	
}
}




