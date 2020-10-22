package com.nttdata.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class vowelsBuffered {
	
	public static void PrintCounts(String abc) throws FileNotFoundException {
		 
		int TotalWords = 0;
		int TotalLines = 0;
		int TotalCharacters = 0;
 
		String line="";
 
	     try (BufferedReader bf = new BufferedReader(new FileReader(abc))) {
			
			// read each line one by one
			while ((line = bf.readLine()) != null) {
				//crunchifyLog(line);
				TotalLines++;
 
				// ignore multiple white spaces
				String[] myWords = line.replaceAll("\\s+", " ").split(" ");
 
				for (String s : myWords) {
					TotalCharacters += s.length();
				}
 
				TotalWords += myWords.length;
 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*crunchifyLog("\n========== Result ==========");
 
		crunchifyLog("* Total Characters: " + TotalCharacters);
		crunchifyLog("* Total Words: " + TotalWords);
		crunchifyLog("* Toal Lines: " + TotalLines);*/
	}
 
	//private static void crunchifyLog(String string) {
		//System.out.println(string);
	//}
 
	public static void main(String[] args) {
		try {
			String file =(" C:\\Users\\poornina\\Documents\\training\\abc.txt");
			PrintCounts(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}


