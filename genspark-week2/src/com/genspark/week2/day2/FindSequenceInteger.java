package com.genspark.week2.day2;

import java.util.ArrayList;
import java.util.List;

public class FindSequenceInteger {
	public static void main(String[] args) {
		List<Integer> inputList1=new ArrayList<Integer>();
		inputList1.add(2);
		inputList1.add(1);
		inputList1.add(3);
		inputList1.add(6);
		inputList1.add(5);
		
		List<Integer> inputList2=new ArrayList<Integer>();
		inputList2.add(1);
		inputList2.add(2);
		inputList2.add(3);
		inputList2.add(4);
		inputList2.add(6); 
		
	    System.out.println(findMissingForSortedList(inputList1)); 
        System.out.println(findMissingForSortedList(inputList2));

   }
	
	//
	public static int findMissingForSortedList(List<Integer> list)
	{
			java.util.Collections.sort(list);
	       int lastElement=list.get(list.size()-1);
           int idealSum=lastElement*(lastElement+1)/2;
	       int sum=list.stream().reduce(0, Integer::sum);
	       return idealSum-sum;	     
	}
}
