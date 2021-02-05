package Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/mm/yyyy");
		String str=format.format(d);
		System.out.println("Date :" +str);
		String str1="22/03/2009";
		Date d1=format.parse(str1);
		System.out.println(d1);
		
	}

}
