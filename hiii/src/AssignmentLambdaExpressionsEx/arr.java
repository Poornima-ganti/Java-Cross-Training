package AssignmentLambdaExpressionsEx;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class arr {
	String name;
	int id;
	String city;
	int salary;
	public arr(String name, int id, String city, int salary) {
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
	ArrayList<arr> hs=new ArrayList<>();
	hs.add(new arr("poornima", 1234 ,"hyd",75000));
	hs.add(new arr("vaishnavi",510,"pune",45000));
	hs.add(new arr("john",419,"kolkata",120000));
	hs.add(new arr("geetha",460,"bnglre",78000));
hs.add(new arr("john",910,"chennai",56000));
	Collections.sort(hs, (e1,e2)->{
		
		return (e1.name).compareTo(e2.name);
	});
	/*for (arr employee : hs) {
		System.out.println(employee);
	}*/
	
	hs.forEach((Employee)->System.out.println(Employee));
	
	/*List<Integer>l=new ArrayList<Integer>();
	List<Integer> i=hs.stream().filter(p->p.salary>70000).map(p->p.salary).collect(Collectors.toList());
	System.out.println("salary greater than 70000"+i);
	Optional<Integer> sal=hs.stream().map(p->p.salary).reduce((sum,salary)->(sum+salary));
	System.out.println("sum of total employee salaries are" + sal);
	long se=hs.stream().count();
	System.out.println(se);*/

	;
	}

	}



