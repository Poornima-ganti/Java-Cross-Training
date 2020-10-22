package AssignmentLambdaExpressionsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.Collectors;



public class PriorityQue {
	public static void main(String args[]) {
		
		PriorityQueue<Employee>hs=new PriorityQueue<Employee>();
		hs.add(new Employee("Poornima",410,"hyd",50000));
	    hs.add(new Employee("vaishnavi",510,"pune",45000));
		hs.add(new Employee("john",419,"kolkata",120000));
		hs.add(new Employee("bhavi",460,"bnglre",78000));
		hs.add(new Employee("kavya",910,"chennai",56000));
	
		for (Employee employee : hs)
		{
			System.out.println(employee);
		
		}
		
		
		
		
		
		
		
		
		
		//hs.forEach((Employee)->System.out.println(Employee));
		
		//List<Integer>l=new ArrayList<Integer>();
		//Deque<Integer>l=new ArrayDeque<Integer>();
		/*PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
			List<Integer> g=hs.stream().filter(p->p.salary>70000).map(p->p.salary).collect(Collectors.toList());
			System.out.println("salary greater than 70000"+g);
			Optional<Integer> sal=hs.stream().map(p->p.salary).reduce((sum,salary)->(sum+salary));
			System.out.println("sum of total employee salaries are" + sal);
			long se=hs.stream().count();
			System.out.println(se);*/
		}
		}



		
	


