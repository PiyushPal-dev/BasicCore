package com.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestDeque {
	public static void main(String[] args) {
		ArrayDeque r= new ArrayDeque();
		//r.offerFirst(34);
		//r.offerFirst(45);
		r.add(78);
		r.add(45);
		r.add(89);
		r.add("DJ");
		r.add("raj");
		r.add(45);
		r.offerFirst(2);
		r.offerLast(5);
		System.out.println(r.peekFirst());
		System.out.println(r.peekLast());
		System.out.println(r);
		Iterator i= r.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		
	}

}
