package com.genspark.week2.day1;

import java.util.Arrays;

public class ArrayProcessorImpl  {

	
	public static final ArrayProcessor max = (doubleArr) -> Arrays.stream(doubleArr).max().getAsDouble();
	public static final ArrayProcessor min = (doubleArr) -> Arrays.stream(doubleArr).min().getAsDouble();
	public static final ArrayProcessor sum = (doubleArr) -> Arrays.stream(doubleArr).sum();
	public static final ArrayProcessor avg = (doubleArr) -> Arrays.stream(doubleArr).average().getAsDouble();
	
	public static final ArrayProcessor countVal = (doubleArr) -> Arrays.stream(doubleArr).average().getAsDouble();
	
	
	
	
	
	public static void main(String[] args) {
		double[] testDoubleArray = {3.5,5.0,17.5,11.55,0.1,11.55};
		// TODO Auto-generated method stub
		System.out.println(max.apply(testDoubleArray));
		System.out.println(min.apply(testDoubleArray));
		System.out.println(sum.apply(testDoubleArray));
		System.out.println(avg.apply(testDoubleArray));
		System.out.println(counter(11.55).apply(testDoubleArray));
	}
	
	
	public static ArrayProcessor counter( double value) {		
		return (inputDoubleArray) -> Arrays.stream(inputDoubleArray).filter(x->x==value).count();
	}



}
