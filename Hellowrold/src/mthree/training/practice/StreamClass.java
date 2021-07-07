package mthree.training.practice;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,5,6,10);
		
		//If we want to filer out the even numbers from nums list :-
		//Approach:-1 (Old approach) (Not at all recommended)
		
		List<Integer> evenNums = new ArrayList<Integer>();
		
		for(int i:nums)
		{
			if(i%2 == 0)
			{
				evenNums.add(i);
			}
		}
		for(int i:evenNums)
		{
			System.out.println("Normal filtered numbers:-"+i);
		}
		
		//Approach:-2 Using Only Streams (No lambda expressions involved)
		
		Stream<Integer> integerStream = nums.stream();   //creation of stream
		Stream<Integer> streamOfEvenNumbers = integerStream.filter(new FilterEvenNums()); //computing the stream (i.e, Applying functions)
		List<Integer> evenList = streamOfEvenNumbers.collect(Collectors.toList());//Collecting the computed result
		for(int i: evenList)
		{
			System.out.println("Streamed Nums with a class implementing Predicate interface:-"+i);
		}
		
		//Approach:-3 Using Streams along with Lambda Expressions  [Basically it is easy approach because everything comes into a single line]
		
		List<Integer> evenList2=nums
									.stream()
									.filter(n-> n%2 == 0)
									.collect(Collectors.toList()); 
		
		for(int i: evenList2)
		{
			System.out.println("Streamed using Lambda without any class:-"+i);
		}

		
		//Approach:-4 Using Streams along with Lambda Expressing but traversing through forEach and Consumer Class
		
		nums.
			stream()
			.filter(n-> n%2 == 0)
			.forEach(new EvenConsumer());
		
		
		//Approach:-5 Using Streams along with Lambda Expressions but directly traversing through forEach without any Class 
		
		nums.
			stream()
			.filter(n-> n%2 == 0)
			.forEach(n-> System.out.println("Streamed with lambda without collector and without any class:-"+n));
		
		//In this approach there is no need of any collector, so we need not store it any list. So this is more enhanced approach
	
		//-----------------------------------------------------------------------------------
		
		// If we wanted to sort the filtered elements, then there is another two approach!!
		
		//Approach1:- Sort using a class implementing Comparator interface
		
		nums.
			stream()
			.filter(n-> n%2 == 0)
			.sorted(new MyComparator())
			.forEach(n-> System.out.println("Sorted version of filtered numbers using Comparator interface:-"+n));
		
		
		
		//Arrpoach2:- Sort without using any class or interface but without using lambda expressions
		
		nums.
			stream()
			.filter(n-> n%2 == 0)
			.sorted((i,j)-> j - i)   //Descending sort
			.forEach(n->System.out.println("Sorted without using Comparable interface:-"+n));
		
		
		
	}
	
	
	

}

class FilterEvenNums implements Predicate<Integer>
{
	@Override
	public boolean test(Integer integer)
	{
		if(integer%2 == 0)
		{
			return true;
		}
		else
		{
		
			return false;
		}
	}
}

class EvenConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println("Streamed with lambda without a collector but with a class implementing consumer interface:-"+t);
		
	}
	

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;   //Descending order
	}

	
	
}


