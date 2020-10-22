package LambdaExpressionsEx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import Collections1.Book;

//import com.nttdata.Collections.Employee;

//import Collections1.Student;

public class ProdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<Product>list1=new HashSet<>();
		LinkedList<Product> list1 =new LinkedList<Product>();
		//List<Product> list1=new ArrayList<>();
		//Deque<Product> list1=new ArrayDeque<Product>();
		//PriorityQueue<Product>queue=new PriorityQueue<>();
		list1.add(new Product(23,"mobile",30000));
		list1.add(new Product(03,"bread",300));
		list1.add(new Product(93,"table",40000));
		list1.add(new Product(73,"fan",2000));
		list1.add(new Product(18,"laptop",90000));
		list1.add(new Product(83,"tv",25000));
		list1.add(new Product(43,"sugar",400));
		
		List<Double>listD=new ArrayList<>();
		//LinkedList<Double>listE=new LinkedList<>(); 
		//System.out.println(Product);
		for(Product p:list1)
		{
			if(p.price<30000)
			{
				listD.add( p.price);
			}
			System.out.println(listD);
		}
		
		
		//streams
//Set<Double>d=list1.stream().filter(p->p.price <30000).map(p->p.price).
                        // collect(Collectors.toSet());
		
//LinkedList<Double>d=list1.stream().filter(p->p.price<30000).map(p->p.price)
              // .collect(Collectors.toCollection(LinkedList::new));
//System.out.println(d);
     /* Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(20).forEach(System.out::println);
      
      //reduce 
      Double dd=list1.stream().map(p->p.price).reduce(0.0, (sum,price)->(sum+price));
      System.out.println(dd);*/
	}
}
		
	


