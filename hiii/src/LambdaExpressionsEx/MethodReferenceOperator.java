package LambdaExpressionsEx;

public class MethodReferenceOperator {
	
	static void Hello()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h=MethodReferenceOperator::Hello;
		System.out.println(h);
		h.print();

	}

}
