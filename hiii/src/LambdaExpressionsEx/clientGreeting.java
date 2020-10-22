package LambdaExpressionsEx;

import java.util.function.Function;
import java.util.function.Predicate;

public class clientGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String s="poornima";
		Greeting g1=(s1)->{System.out.println(s1+ " hello ");
		};
		g1.greet(s);
		String s1="vaishnavi";
		Greeting g2=(s2)->{
			System.out.println(s1+ " hello ");
		};
		g2.greet(s1);*/
		
		Predicate<Integer> p=I->(I>20);
		System.out.println("Predicate"+p.test(6));
		
		Predicate<String>s1=s->(s.length()>4);
		System.out.println(s1.test("hiuui"));
		
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("hiii"));
		System.out.println(f.apply("happy weekend"));
		
		
	}
}