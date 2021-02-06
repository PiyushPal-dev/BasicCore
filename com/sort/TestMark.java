package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMark {
public static void main(String[] args) {
	Marksheet m1=new Marksheet();
	m1.setRollNo("1");
	m1.setfName("Sara");
	m1.setlName("k");
	Marksheet m2 = new Marksheet();
	m2.setRollNo("2");
	m2.setfName("Andy");
	m2.setlName("G");
	Marksheet m3=new Marksheet();
	m3.setRollNo("3");
	m3.setfName("Carlo");
	m3.setlName("F");
	
	ArrayList l=new ArrayList();
   l.add(m1);
   l.add(m2);
   l.add(m3);
   
   Collections.sort(l,new OrderbyName());
   Iterator it=l.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
}
}
