package com.basicjava;

public class Empolerr {
	private int id;
	private String name;
	private String lastname;
	private int salary;
	private int age;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Empolerr [id=" + id + ", name=" + name + ", lastname=" + lastname + ", salary=" + salary + ", age="
				+ age + "]";
	}
	public Empolerr(int id, String name, String lastname, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
		this.age = age;
	}
	public Empolerr() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
