package com.nttdata.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BufferReaderExample {
	
	////public static void process(String str)
	//{
	//	System.out.println("Processing....."+str+"\n");
	//}
	// private HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
    void ReadFromFile()
    {
    	 /*// private Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
    	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    	//String line="";
    ////	String s1="";
    	//while(!(line.equalsIgnoreCase("quit"))&&!line.equalsIgnoreCase("exit"));
    	//{
    		System.out.println("enter....");
    		try {
    			line=bf.readLine();
 //   			BufferedReader.process(line);
    			
    		}
    		catch(IOException e) {
    			e.printStackTrace();
    		}
    	}*/
    	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    	int count=0;
    	String s;
    	try {
    		s=bf.readLine();
    		for(int i=0;i<s.length();i++)
    		{
    			char ch=s.charAt(i);
    			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
    			{
    				count++;
    			}
    		}
    	}
    	catch(IOException e)
    	{
    	   e.printStackTrace();	
    	}
    	System.out.println("no.of vowels"+count);
    }
    	
    	
    public static void main(String[] args) {
    	BufferReaderExample b=new BufferReaderExample();
    	b.ReadFromFile();
    }
}