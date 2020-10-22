package LambdaExpressionsEx;

import java.util.function.BiFunction;

public class InstanceMethodEx {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static float add1(float a, float b)
	{
		return a+b;
	}
	public static void main(String args[]) {
		BiFunction<Integer,Integer,Integer>add=InstanceMethodEx::add;
		int res=add.apply(10, 20);
		System.out.println(res);
		BiFunction<Integer,Float,Float> add1=InstanceMethodEx::add1;
	    float res1=add1.apply(10, 20.09f);
	    System.out.println(res1);
		
		
	}
}
