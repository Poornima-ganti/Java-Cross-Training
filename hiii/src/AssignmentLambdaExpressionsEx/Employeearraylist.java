package AssignmentLambdaExpressionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employeearraylist {
	String name;
	int id;
	String city;
	int salary;

	public Employeearraylist(String name, int id, String city, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employeearraylist> hs = new ArrayList<>();
		hs.add(new Emp("Poornima",1214,"Guntur",30000));
		hs.add(new Emp("vaishnavi",1215,"banglore",35000));
		hs.add(new Emp("geetha",1216,"kolkata",12000));
		hs.add(new Emp("bhavi",1217,"hyd",45000));
		hs.add(new Emp("ravi",1218,"pune",56000));
	
		Collections.sort(e, (e1, e2) -> {

			return (e1.name).compareTo(e2.name);
		});
		for (Employeearraylist employee : e) {
			System.out.println(employee);
		}
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> i = e.stream().filter(p -> p.salary > 70000).map(p -> p.salary).collect(Collectors.toList());
		System.out.println("salary greater than 70000" + i);
		Optional<Integer> sal = e.stream().map(p -> p.salary).reduce((sum, salary) -> (sum + salary));
		System.out.println("sum of total employee salaries are" + sal);
		long se = e.stream().count();
		System.out.println(se);

		;
	}

}