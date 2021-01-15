/**
 * Person class is used to get details of account holder
 * 
 * @author rutuja pise
 */

package com.cg.domain;

public class Person {
	/**
	 * Name of the accound holder
	 */
	private String name;
	/**
	 * Age of the account holder
	 */
	private float age;
	
	/**
	 * Constructor of Person class
	 * @param name
	 * @param age
	 */
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
