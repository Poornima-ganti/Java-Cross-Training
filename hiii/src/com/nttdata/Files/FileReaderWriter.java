package com.nttdata.Files;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {
	void writeFile()
	{
	try
	{
	 FileWriter fw = new FileWriter("C:\\Users\\poornina\\Documents\\training\\abc.txt");
	 fw.write("This is Eclipse");
	 fw.close();
	// System.out.println(" File is Created! ");
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}

	}

	void readFromFile()
	{
	try
	{
	 FileReader fr = new FileReader("C:\\Users\\poornina\\Documents\\training\\abc.txt");
	     int i;
	     while((i = fr.read())!= -1)
	     {
	     System.out.print((char)i);
	     }
	 fr.read();
	     fr.close();
	     
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
	public static void main(String[] args) {

	FileReaderWriter f = new FileReaderWriter();
	f.writeFile();
	f.readFromFile();
	}

	}
