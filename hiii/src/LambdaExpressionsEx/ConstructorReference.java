package LambdaExpressionsEx;

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messager hello = Message::new;  
        hello.getMessage("Hello");  
    }  
  

	}


