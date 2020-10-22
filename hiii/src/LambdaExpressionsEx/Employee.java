package LambdaExpressionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Employee implements Comparable<Employee>, Comparator<Employee>{
	int empid;
	 String name;
	 double n=3.14;
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
    
	public String toString()
	 {
		 return "Employee [empid="+empid + ", empName="+name+" ]";
	 }
 public static void main(String args[])
 {
	 //List<Employee> list=new ArrayList<>();
	// LinkedList<Employee> list =new LinkedList<Employee>();
	 HashSet<Employee> list = new HashSet<Employee>(); 
	 
	 list.add(new Employee(111,"Poornima"));
	 list.add(new Employee(112,"Vaishnavi"));
	 list.add(new Employee(114,"Bhavitha"));
	 Collections.sort((List<Employee>) list,(e1,e2)->{
		 return e1.name.compareTo(e2.name);
				 });
	 
	/* for (Employee e:list)
	 {
		 System.out.println("Names are " + e.name);*/
	
	 
	 list.forEach((Employee)->System.out.println(Employee));
	 
 }

 public static class Comparators {

     public static Comparator<Employee> NAME = new Comparator<Employee>() {
         @Override
         public int compare(Employee e1, Employee e2) {
             return e1.name.compareTo(e2.name);
         }
     };
     public static Comparator<Employee> ID = new Comparator<Employee>() {
         @Override
         public int compare(Employee e1, Employee e2) {
             return e1.empid - e2.empid;
         }
     };
     public static Comparator<Employee> NAMEANDID = new Comparator<Employee>() {
         @Override
         public int compare(Employee e1, Employee e2) {
             int i = e1.name.compareTo(e2.name);
             if (i == 0) {
                 i = e1.empid -  e2.empid;
             }
             return i;
         }
     };
 }

@Override
public int compare(Employee arg0, Employee arg1) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int compareTo(Employee arg0) {
	// TODO Auto-generated method stub
	return 0;
}
}