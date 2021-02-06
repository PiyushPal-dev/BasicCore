package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadValidEmail {
public static void main(String[] args) throws Exception {
	FileReader f= new FileReader("D://Email.txt");
	BufferedReader br = new BufferedReader(f);
	String s= br.readLine();
	Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$" );
	while (s!= null) {
		Matcher m = p.matcher(s);
		System.out.println(s);
		s = br.readLine();
	}
	
}
}
