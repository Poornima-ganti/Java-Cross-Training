package AssignmentLambdaExpressionsEx;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Optional;
	import java.util.TreeSet;
	import java.util.stream.Collectors;

	public class empf implements Comparable{
		String name;
		int id;
		String city;
		int salary;
		public empf(String name, int id, String city, int salary) {
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
			TreeSet<empf>hs=new TreeSet<empf>();
			hs.add(new empf("Poornima",410,"hyd",50000));
			hs.add(new empf("vaishnavi",510,"pune",45000));
			hs.add(new empf("john",419,"kolkata",120000));
			hs.add(new empf("bhavi",460,"bnglre",78000));
			hs.add(new empf("kavya",910,"chennai",56000));
		
			/*for (empf employee : hs)
			{
				System.out.println(employee);
			}*/
			
			hs.forEach((Employee)->System.out.println(Employee));
		
		/*	List<Integer>l=new ArrayList<Integer>();
			List<Integer> g=hs.stream().filter(p->p.salary>70000).map(p->p.salary).collect(Collectors.toList());
			System.out.println("salary greater than 70000"+g);
			Optional<Integer> sal=hs.stream().map(p->p.salary).reduce((sum,salary)->(sum+salary));
			System.out.println("sum of total employee salaries are" + sal);
			long se=hs.stream().count();
			System.out.println(se);*/
		}
		@Override
		public int compareTo(Object a) {
			// TODO Auto-generated method stub
			if(id>this.id)
			{
				return 1;
		}
			else if(id<this.id)
			{
				return -1;
			}
			else
				return 0;
		}			
			}


