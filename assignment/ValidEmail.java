package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ValidEmail {
	public static void main(String[] args) throws Exception {
 FileReader f= new FileReader("D://Email.txt");
 BufferedReader br = new BufferedReader(f);
 String r = br.readLine();
 
 while(r!=null) {
	 StringTokenizer s = new StringTokenizer(r,"@");
	 String s1 = s.nextToken();
	 //System.out.println(s1);
	 String s2 = s.nextToken();
	 //System.out.println(s2);
	 StringTokenizer s3= new StringTokenizer(s2,".");
	 String s4= s3.nextToken();
	 //System.out.println(s4);
	 String s5= s3.nextToken();
	 //System.out.println(s5);
	 if(r.contains("@") && r.contains(".")  ) {
		 if(s1.length()>=3) {
			 if(s4.length()==5) {
				 if(s5.contentEquals("com")) {
					 System.out.println(r);
				 }
			 }
		 }
	 }
	 r= br.readLine();
 }
}
}
