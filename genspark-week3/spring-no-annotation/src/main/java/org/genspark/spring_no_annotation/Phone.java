package org.genspark.spring_no_annotation;

public class Phone {
	
	private String mob;
	
	
	public Phone(String mob) {
		super();
		this.mob = mob;
	}


	@Override
	public String toString() {
		return "Phone [mob=" + mob + "]";
	}


}
