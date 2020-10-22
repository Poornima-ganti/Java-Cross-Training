package com.nttdata.Files;

import java.io.Serializable;

public class Employee  implements Serializable{
          private static final long serialVersionUID=1L;
          transient int a;
          static int b=10;
          String name;
          int age;
          public Employee(int a, String name, int age) {
        	  super();
        	  this.a=a;
        	  this.name=name;
        	  this.age=age;
          }
          void print(Employee e)
          {
        	  System.out.println("Transient value"+e.a +"\t"+"Name is :"+e.name+"\t"+"Age is"+age);
        	  System.out.println("variable:"+e.b);
        	  
          }
}
