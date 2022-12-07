package org.genspark.spring_annotation.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Phone {
	private String mob="pkg2phone";

	@Override
	public String toString() {
		return "Phone [mob=" + mob + "]";
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	
}
