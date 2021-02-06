package com.inputoutputstream;

import java.io.FileReader;

public class ReadbyCharacter {
   public static void main(String[] args) throws Exception {
   FileReader reader = new FileReader("D:/Carlo.txt");
   int c=reader.read();
   char tuf;
   while(c!=-1) {
	   tuf= (char) c;
	   System.out.println(tuf);
	   c=reader.read();
   }
}
}
