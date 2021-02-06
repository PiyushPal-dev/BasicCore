package com.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBinaryFile {
public static void main(String[] args) throws Exception {
	String source = "D:Carlo.txt";
	String target = "D:Sara.txt";
	FileInputStream in = new FileInputStream(source);
	FileOutputStream out = new FileOutputStream(target);
	int ch = in.read();
	while(ch!=-1) {
		out.write(ch);
		ch = in.read();
	}
	out.close();
	in.close();
	System.out.println("Successful");
}

}
