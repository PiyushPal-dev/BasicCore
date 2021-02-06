package com.collections;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	ArrayList l= new ArrayList();
	l.add(21);
	l.add("sffd");
	l.add(34.5);
	l.add("Nacho");
	//l.clear();
//System.out.println(l.isEmpty());
	//System.out.println(l.contains(21));
	System.out.println(l);
	ArrayList y= new ArrayList();
	y.add(34);
	y.add("DJ");
	y.add(34.5);
	y.addAll(l);
	System.out.println(y);
	//System.out.println(y.containsAll(l));
	//System.out.println(l.remove(1));
	//System.out.println(l.removeAll(l));
	l.size();
	//System.out.println(l.retainAll(y));
	System.out.println(l);
	System.out.println(y);
}
}
