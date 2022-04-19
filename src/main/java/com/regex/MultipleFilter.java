package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionEvent;

public class MultipleFilter {

	public static void main(String[] args) {
		List<Employee> list = getEmployeeList().stream().filter(emp -> emp.getId() == 12).filter(emp1 -> emp1.getName().equals("k")).collect(Collectors.toList());
		System.out.println("Size of the list :"+ list);
		if(list.size() > 0) {
			throw new NullPointerException("Null is present there");
		}
	}
	
	private static List<Employee> getEmployeeList(){
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setId(12);
		e1.setName("k");
		Employee e2 = new Employee();
		e1.setId(13);
		e1.setName("kk");
		
		list.add(e1);
		list.add(e2);
		return list;
	}

}
class Employee{
	int id;
	String name;
	String email;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
