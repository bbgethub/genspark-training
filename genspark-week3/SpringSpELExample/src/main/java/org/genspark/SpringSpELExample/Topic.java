package org.genspark.SpringSpELExample;

public class Topic {
	 
	    // Class data members
	    private String name;
	 
	    // Constructor: Default
	    public Topic() {
	    	
	    }
	 
	    // Constructor: Parametrized
	    public Topic(String name) {
	    	this.name = name;
	    	}
	 
	    // Getters and setters
	    public String getName() {
	    	return name;
	    	}
	    public void setName(String name) {
	    	this.name = name; 
	    	}
	    public String toString() {
	    	return name; 
	    	}
}
