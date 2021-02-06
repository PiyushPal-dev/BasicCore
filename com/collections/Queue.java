package com.collections;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		
	
  PriorityQueue p= new PriorityQueue();
  p.add(78);
  p.add(56);
  p.add(45);
  p.add(34);
  p.add(53);
  p.add(234);
  p.add(456);
  p.add(456);
  p.offer(97);
  int q=p.size();
  System.out.println(p);
  //System.out.println(p.poll());
  for(int i=0;i<=q;i++) {
	  System.out.println(p.poll());
  }
  
	}
}
