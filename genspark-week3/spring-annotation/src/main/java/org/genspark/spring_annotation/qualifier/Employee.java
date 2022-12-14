package org.genspark.spring_annotation.qualifier;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Employee {
	private int id;

	private String name="pkg2";
	private List<Phone> ph;
	private Address add;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Phone> getPh() {
		return ph;
	}
	public void setPh(List<Phone> ph) {
		this.ph = ph;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ph=" + ph + ", add=" + add + "]";
	}
	
}
