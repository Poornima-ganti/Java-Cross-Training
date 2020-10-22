package com.nttdata.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {
	
	void writeToFile()
	{
		try {
		FileOutputStream out=new FileOutputStream("C:/Users/poornina/Documents/training/abc.txt");
		out.write(67);
		out.close();
		//System.out.println("file is written");
	} catch (IOException e) {
		e.printStackTrace();
	}

}
	void readfile()
	{
		try {
			FileInputStream in=new FileInputStream("C:/Users/poornina/Documents/training/abc.txt");
			int i=in.read();
			int j=in.read();
			System.out.println((char)i);
			System.out.println((char)j);
			//in.read("poornima");
			//in.close();
			}catch(IOException e)
		{
				e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FileOutPutStreamExample f=new FileOutPutStreamExample();
		f.writeToFile();
		f.readfile();
	}
}