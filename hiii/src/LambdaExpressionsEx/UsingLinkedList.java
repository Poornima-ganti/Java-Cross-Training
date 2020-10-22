package LambdaExpressionsEx;

import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> l =new LinkedList<Employee>();
		l.add(new Employee(161,"Poornima"));
		l.add(new Employee(110,"Vaishnavi"));
		
		l.forEach((Employee)->System.out.println(Employee));
		
		
		
	}
}
		
			


