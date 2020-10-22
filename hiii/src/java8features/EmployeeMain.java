package java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>(); 
		List<Employee>hm=new ArrayList<Employee>();
		hm.add(new Employee("poornima",12,"guntur",25000));
		hm.add(new Employee("vaish",13,"warangal",35000));
		hm.add(new Employee("anu",14,"goa",16000));
		hm.add(new Employee("tanu",15,"mh",25000));
		hm.add(new Employee("manu",16,"mp",35000));
		hm.add(new Employee("sonu",17,"bhopal",45000));
		hm.add(new Employee("monu",18,"coimbatore",55000));
		hm.add(new Employee("tony",19,"bhilwara",65000));
		hm.add(new Employee("sachin",20,"kolkata",75000));
		hm.add(new Employee("jatin",21,"noida",85000));
		hm.add(new Employee("yash",22,"punjab",95000));
		hm.add(new Employee("pranaya",23,"karanataka",10000));
		hm.add(new Employee("uma",24,"chennai",11000));
		hm.add(new Employee("sai",25,"manglore",22000));
		hm.add(new Employee("vijay",26,"coimbatore",18000));
		
      hm.stream().filter(s->(s.salary>10000 && s.salary<20000)).forEach(s->System.out.println(s.salary+(s.salary*5/100)));
   // ll.forEach((s)->System.out.println(s));
     
     long c=hm.stream().filter(s->s.city.equalsIgnoreCase("Guntur")).count();
     System.out.println("employyees from guntur "+c);
     
     double d = hm.stream().map(s->s.salary).reduce(0.0, (sum,sal)->(sum+sal));
     System.out.println("sum of total"+d);
     
     
}
}