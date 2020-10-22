package LambdaExpressionsEx;

import java.util.ArrayList;
import java.util.List;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Addition a1=(a,b)->{System.out.println("Addition of 2 numbers" +(a+b));};
		Substraction s2=(a,b)->{System.out.println("Substraction of 2 numbers" +(a-b));};
		Multiplication m3=(a,b)->{System.out.println("Multiplication of 2 numbers" +(a*b));};
		Division d4=(a,b)->{System.out.println("Division of 2 numbers" +(a/b));};
		
		a1.add(22,22);
		s2.subtract(12, 6);
		m3.multiply(12, 12);
		d4.divide(12, 6);
		
	}
}
