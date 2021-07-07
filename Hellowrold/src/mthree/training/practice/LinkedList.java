package mthree.training.practice;

import java.util.*;
public class LinkedList {
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
Node head;
public void add(int data)
{
	Node ll = new Node(data);
	Node current = head;
	if(head == null)
	{
		head = ll;
	}
	else
	{
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = ll;
	}
}
public void display()
{
	Node temp = head;
	while(temp!= null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
}
public void get(int i)
{
	Node current = head;
	int c=0;
	while(current.next != null)
	{
		if(c == i)
		{
			System.out.println(current.data);
			break;
		}
		c++;
		current = current.next;
	}
}
public static void main(String args[])
{
	LinkedList obj = new LinkedList();
	obj.add(10);
	obj.add(15);
	obj.add(27);
	obj.add(11);
	obj.add(19);
	obj.add(25);
	obj.get(1);
	obj.get(4);
}
}
