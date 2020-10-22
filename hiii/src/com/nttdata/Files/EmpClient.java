package com.nttdata.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpClient {
	public static void main(String args[]) {
		Employee employee=new Employee(12,"Anu",20);
		String fileName="abc.txt";
		
		//SERIALIZATION
		try {
			
			FileOutputStream fout=new FileOutputStream(fileName); 
			ObjectOutputStream out=new ObjectOutputStream(fout); 
			out.writeObject(employee); //method write object
			out.close();
			fout.close();
			System.out.println("Object has been serialized \n" +"Data before Deserialization");
			employee.print(employee);
		}catch (IOException e) {
			e.printStackTrace();
		}
		//DESERIALIZATION
		
	      employee=null;
	      FileInputStream fin;
	      try {
	    	  //Reading object file
	    	  fin=new FileInputStream(fileName);
	    	  ObjectInputStream in=new ObjectInputStream(fin);
	    	  employee=(Employee)in.readObject(); // method read the object(casting)
	    	  employee.b=20;
	    	  in.close();
	    	  fin.close();
	    	  System.out.println("Object has been Deswerialized");
	    	  employee.print(employee);//
	      }catch(IOException | ClassNotFoundException e) {
	    	  e.printStackTrace();
	      }
	      }


}