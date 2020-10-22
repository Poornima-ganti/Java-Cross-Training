package LambdaExpressionsEx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arraydequelambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Product> list1=new ArrayDeque<>();
		list1.add(new Product("mobile",30000));
		list1.add(new Product("bread",300));
		list1.add(new Product("table",40000));
		list1.add(new Product("fan",2000));
		list1.add(new Product("laptop",90000));
		list1.add(new Product("tv",25000));
		list1.add(new Product("sugar",400));
		
		
		Deque<Double>listE=new ArrayDeque<>();
		//System.out.println(Product);
		for(Product p:list1)
		{
			if(p.price<20000)
			{
				listE.add( p.price);
			}
			System.out.println(listE);
		}
		
		
		//streams
		Deque<Double> d =list1.stream().filter(p->p.price>10000).map(p->p.price)
	            .collect(Collectors.toCollection(ArrayDeque::new));
		
		
	System.out.println(d);
	     Stream.iterate(1,e->e+1).filter(e->e%2==0).limit(2).forEach(System.out::println);
	      
	      //reduce 
	   //   Double dd=list1.stream().map(p->p.price).reduce(0.0, (sum,price)->(sum+price));
	   //  System.out.println(dd);
		}
	}
			
		