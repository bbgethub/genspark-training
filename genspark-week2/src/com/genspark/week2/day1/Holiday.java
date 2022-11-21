package com.genspark.week2.day1;

import java.util.stream.Stream;

public class Holiday {
	private String name;
	private int day;
	private String month;

Holiday(String name, int day, String month)
{
	this.name=name;
	this.day=day;
	this.month=month;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public String getMonth() {
	return month;
}

public void setMonth(String month) {
	this.month = month;
}

public static boolean inSameMonth(Holiday obj1, Holiday obj2)
{
	return obj1.getMonth().equalsIgnoreCase(obj2.getMonth());
}

public static double avgDate(Holiday[] holiday)
{
	//With Stream
	return Stream.of(holiday).mapToDouble(h->h.getDay()).average().getAsDouble();
	
	//without Stream
	
	/*for(int i=0; i<holiday.length; i++)
		daySum+=holiday[i].getDay();
	return (double)daySum/holiday.length;*/
}



public static void main(String arg[])
{
	Holiday[] holiday =new Holiday[2];
	holiday[0]=new Holiday("Independence Day",4,"June");
	holiday[1]=new Holiday("Thanksgiving",21,"Nov");
	System.out.println("Checking the moths are same: "+ Holiday.inSameMonth(holiday[0],holiday[1]));
	System.out.println("Checking average of the day: "+Holiday.avgDate(holiday));
}
}