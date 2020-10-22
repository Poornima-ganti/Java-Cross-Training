package com.nttdata.Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;
	
	public class Vowelsclass {
	
     public void writeFile()
	  {
    	
	  try
	  {
		  
	   BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\poornina\\Documents\\training\\abc.txt"));
	  // FileWriter fw = new FileWriter("C:\\Users\\poornina\\Documents\\training\\abc.txt");
	  fw.write("hi");
	   fw.write("eclipse ide");
	   fw.close();
	   System.out.println(" File is Created! ");
	  }
	  catch(Exception e)
	  {
	  e.printStackTrace();
	  }
	 
	  }
	void readFromFile() throws Exception
	{
	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\poornina\\Documents\\training\\abc.txt"));
	  String line="";

	  while((line = br.readLine())!= null)
	  {
	  System.out.println(line);
	  int c = 0;
	       String s = line;

	     for(int i=0;i<s.length();i++)
	     {
	        char ch = s.charAt(i);   //It will return the char value of that index.
	       
	        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
	        {
	           c++;
	        }
	     }
	      System.out.println(" vowels are: "+c);
	  }
	}

	public static void main(String[] args) throws Exception {

	Vowelsclass b = new Vowelsclass();
	b.writeFile();
	b.readFromFile();

	}

	}


