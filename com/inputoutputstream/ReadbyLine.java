package com.inputoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadbyLine {
	public static void main(String[] args) throws Exception {	
  FileReader reader= new FileReader("D:/Carlo.txt");
  BufferedReader br =new BufferedReader(reader);
  String read = br.readLine();
   while(read!=null) {
	  System.out.println(read);
	  read = br.readLine();
   }
}
}