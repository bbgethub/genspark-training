package com.genspark.week2.day1;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private String studio;
	private String rating;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	Movie(String title,String studio, String rating)
	{
		this.title=title;
		this.studio=studio;
		this.rating=rating;
	}

	Movie(String title,String studio)
	{
		this.title=title;
		this.studio=studio;
		this.rating="PG";
	}
	public void showData()
	{
		System.out.println("Moive Title:"+title+" Studio: "+studio+" Rating: "+rating);
	}
	public  static  List<Movie> getPG(Movie[] movie)
	{
		//List<Object> arrayList = new ArrayList<Object>();
		List<Movie> newList=new ArrayList<Movie>();

		for(int i=0;i<movie.length;i++)
		{
			if(movie[i].getRating()=="PG")
			{
				newList.add(movie[i]);
			}
				
		}
		return newList;
	}
	
	
	
	public static void main(String arg[])
	{
		Movie[] movie=new Movie[5];
		movie[0]=new Movie("Casino Royale","Eon Production","PG-13");
		movie[1]=new Movie("AAA","Production1");
		movie[2]=new Movie("BBB","Eon Production","PG-13");
		movie[3]=new Movie("CCC","Production2");
		movie[4]=new Movie("DDD","Production1","PG-13");
		
		for(Movie movies: getPG(movie)) {
		   movies.showData();  
		}
		
		
	}
}
