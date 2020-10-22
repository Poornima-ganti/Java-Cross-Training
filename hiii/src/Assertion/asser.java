package Assertion;

import java.util.Scanner;

public class asser {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(":enter");
		int value=s.nextInt();
		assert value<=0:"its invalid no";
		System.out.println(value);
		s.close();
	}
	

}
