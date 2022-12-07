package com.genspark.week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderArrayList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(-3);
		
		System.out.println(list);
		if(list.isEmpty())
		{
			list.add(0);
			list.add(0);
		}
		else
			Collections.sort(list);
		System.out.println(list);
	}

}
