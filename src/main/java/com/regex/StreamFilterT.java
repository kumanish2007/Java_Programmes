/**
 * 
 */
package com.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Lenovo
 *
 */
public class StreamFilterT {
public static void main(String[] args) {
	Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

    List<Integer> collect = infiniteStream
      .skip(4)
      .limit(5)
      .collect(Collectors.toList());
    System.out.println(collect);
    List<Employee1> empList = new ArrayList<>();
    Employee1 emp = new Employee1();
    emp.setEid(101);
    emp.setName("manish");
    emp.setEmail("kukk");
    Employee1 emp1 = new Employee1();
    emp1.setEid(19);
    emp1.setName("kumar");
    emp1.setEmail("ppp");
    Employee1 emp2 = new Employee1();
    emp2.setEid(102);
    emp2.setName("ttt");
    emp2.setEmail("ppp");
    
    empList.add(emp);
    empList.add(emp1);
    empList.add(emp2);
    
    Employee1 firstEmp = empList.stream()
    	      .min((e1, e2) -> e1.getEid() - e2.getEid())
    	      .orElseThrow(NoSuchElementException::new);
    System.out.println(firstEmp);
    
    List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
    
    boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
    boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
    boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
    System.out.println(allEven +" "+ oneEven+" "+noneMultipleOfThree);
    
    Integer latestEmpId = empList.stream()
    	      .mapToInt(Employee1::getEid)
    	      .min()
    	      .orElseThrow(NoSuchElementException::new);
    System.out.println("latestEmpId : " + latestEmpId);
    
    String empNames = empList.stream()
    	      .map(Employee1::getName)
    	      .collect(Collectors.joining(", "))
    	      .toString();
    System.out.println("Employee1 name : "+ empNames);
    
    Set<String> emp1Names = empList.stream()
            .map(Employee1::getName)
            .collect(Collectors.toSet());
    System.out.println("Set of employee1 :"+ emp1Names);
    
    List<Integer> intList1 = Arrays.asList(2, 4, 5, 6, 8);
    Map<Boolean, List<Integer>> isEven = intList1.stream().collect(
      Collectors.partitioningBy(i -> i % 2 == 0));
    System.out.println("Partioning : "+ isEven);
    
    //Integer number = null;
    //Stream<Integer> result = Stream.
   // result.map(x -> x * x).forEach(System.out::println);
}
}
class Employee1{
	private int eid;
	private String name;
	private String email;
	Employee1(){}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
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
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", name=" + name + ", email=" + email + "]";
	}
	
}