package com.inputoutputstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
public static void main(String[] args) throws Exception {
	FileWriter  f= new FileWriter("D:Carlo.txt",true); 
	PrintWriter out = new PrintWriter(f);
	InputStreamReader kb = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(kb);
	
	String line = in.readLine();
	while(!line.equals("Complete")) {
		out.println(line);
		line = in.readLine();
	}
	in.close();
	out.close();
	kb.close();
}
}
