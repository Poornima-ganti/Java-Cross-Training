package AssignmentLambdaExpressionsEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetex {
public static void main(String[] args) {
	LinkedHashSet<Employee>linkedhashset =new LinkedHashSet<>();
	linkedhashset.add(new Employee("Poornima",410,"hyd",50000));
	linkedhashset.add(new Employee("vaishnavi",510,"pune",45000));
	linkedhashset.add(new Employee("john",419,"kolkata",120000));
	linkedhashset.add(new Employee("bhavi",460,"bnglre",78000));
	linkedhashset.add(new Employee("geetha",910,"chennai",56000));
	
	/*for (Employee employee : linkedhashset) {
		System.out.println(employee);
	}*/
	
	
	linkedhashset.forEach((Employee)->System.out.println(Employee));
		
	
	/*long k=linkedhashset.stream().map(p->p.id).count();

		System.out.println(" id count is "+k);*/
		
	}
}