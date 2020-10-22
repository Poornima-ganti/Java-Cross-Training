package AssignmentLambdaExpressionsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Emp implements Comparable{
		String name;
		int id;
		String city;
		int salary;
		public Emp(String name, int id, String city, int salary) {
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
			TreeSet<Emp>hs=new TreeSet<Emp>();
			hs.add(new Emp("Poornima",1214,"Guntur",30000));
			hs.add(new Emp("vaishnavi",1215,"banglore",35000));
			hs.add(new Emp("geetha",1216,"kolkata",12000));
			hs.add(new Emp("bhavi",1217,"hyd",45000));
			hs.add(new Emp("ravi",1218,"pune",56000));
		
			for (Emp employee : hs)
			{
				System.out.println(employee);
			}
		List<Integer>l=new ArrayList<Integer>();
			List<Integer> g=hs.stream().filter(p->p.salary>56000).map(p->p.salary).collect(Collectors.toList());
			System.out.println("salary greater than 35000"+g);
			Optional<Integer> sal=hs.stream().map(p->p.salary).reduce((sum,salary)->(sum+salary));
			//System.out.println("sum of total employee salaries are" + sal);
			long se=hs.stream().count();
			System.out.println(se);
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


