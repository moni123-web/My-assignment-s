package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	private static int size;

	public static void main(String[] args) {
		int[] nums= {3,2,11,4,6,7};
		
		List<Integer> numbers=new ArrayList<Integer>();
		System.out.println("The List is:");
		
		numbers.add(3);
		System.out.println("list after add 1 data is:" +numbers);
		numbers.add(2);
		System.out.println("list after adding 2 data is:" +numbers);
		numbers.add(11);
		System.out.println("list after adding 3 data is:" +numbers);
		numbers.add(4);
		System.out.println("list after adding 4 data is:" +numbers);
		numbers.add(6);
		System.out.println("list after adding 5 data is:" +numbers);
		numbers.add(7);
		System.out.println("list after adding 6 data is:" +numbers);
		
        int sizeOfList = numbers.size();
        System.out.println("The list size is:" +sizeOfList);
        System.out.println("--------------------");
        
        Arrays.sort(nums);
        System.out.println("list after sorting data:" +numbers);
		
        Integer dataAtIndex3 = numbers.get(5);
		System.out.println("Second largest number is :"+(dataAtIndex3));
		
	}
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		

	









