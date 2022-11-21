package com.genspark.week2.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Room implements Comparable<Room>{
	private double width;
	private double length;
	private int floor;

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<=0)
			System.out.println("Width value is less then zero ");
		else
			this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length<=0)
			System.out.println("Length value is less then zero ");
		else
			this.length = length;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	Room()
	{
		this.width=10;
		this.length=12.5;
		this.floor=1;
		
	}
	
	Room(double width, double length, int floor)
	{
		if (width>length)
		{
			setLength(width);
			setWidth(length);
		}
		else
		{
			setLength(length);
			setWidth(width);
		}
		setFloor(floor);		
	}
	public String toString()
	{
		return length+" x "+width+" , floor "+floor;
	}
	
	public int compareTo(Room room)
	{
//		
//		if(this.floor == room.getFloor()) {
//			
//			if(this.length == room.getLength()) {
//				if(this.width == room.getLength()) {
//			}
//			
//		}else {
//			
//		}
		
		if(this.floor!=room.floor) 
			return this.floor-room.floor;
		else if(this.length!=room.length)
			return Double.compare(this.length, length);
		else 
			return Double.compare(this.width, width);
		
	}
	
}

class Classroom extends Room
{
	private int numStudents;
	
	public int getNumStudents() {
		return numStudents;
	}
	
	public void setNumStudents(int numStudents) 
	{
		this.numStudents = numStudents;
	}
	
	Classroom(double d1, double d2, int i1, int i2)
	{
		if (d1>d2)
		{
			setLength(d1);
			setWidth(d2);
		}
		else
		{
			setLength(d2);
			setWidth(d1);
		}
		setFloor(i1);
		setNumStudents(i2);
	}
	
	public String toString()
	{		
		return super.toString() +", Capacity = "+numStudents+" Students";
	}
	
	public static void main(String arg[])
	{
		System.out.println("Hello started");
		Room room[ ]= new Room[6];
		
		room[0]=new Room(20.5,17,1);
		room[1]=new Classroom(12.8,15.2,2,10);
		room[2]=new Room(10,15.5,3);
		room[3]=new Classroom(14.7,20.5,4,20);
		room[4]=new Classroom(20.2,19,1,25);
		room[5]=new Room();
		
		System.out.println("Hello ended");
		for(int i=0;i<5;i++)
			System.out.println(room[i]);
		
		List<Classroom> classrooms= validate(room);
		System.out.println("Classrooms = "+classrooms.size());
	}
	
	public static List<Classroom> validate(Room[] roomArray) {
		
		List<Classroom> classrooList= Arrays.stream(roomArray)
		.filter(x-> x instanceof Classroom)
		.map(x-> (Classroom) x )
		.collect(Collectors.toList()) ;
		return classrooList;
		
	}
}
