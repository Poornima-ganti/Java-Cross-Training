package com.nttdata.Files;
import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	public class DataStream {

	void writeData()
	{
	DataOutputStream dos;
	try
	{
	  dos = new DataOutputStream(new FileOutputStream("Data.txt"));
	  dos.writeInt(7);
	  dos.writeChar('A');
	           dos.writeChars("Hi");
	           dos.writeDouble(1.2);
	           dos.writeFloat(7.2f);
	           dos.writeLong(23432);
	           dos.writeShort(34);
	           dos.writeByte(8);
	           System.out.println("Data Written Successfully");
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}

	void readData()
	{
	DataInputStream dis;
	try
	{
	dis = new DataInputStream(new FileInputStream("Data.txt"));
	int a = dis.readInt();
	char b =dis.readChar();
	char c =dis.readChar();
	double d =dis.readDouble();
	float e =dis.readFloat();
	long f =dis.readLong();
	short g =dis.readShort();
	byte h =dis.readByte();
	System.out.println("Values from the Data File:");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+g+"\t"+h);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
	public static void main(String[] args) {

	DataStream ds = new DataStream();
	ds.writeData();
	ds.readData();
	}

	}



