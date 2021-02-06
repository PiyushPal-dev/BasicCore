package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {
  public static void main(String[] args) {
   SortedSet s = new TreeSet();
   s.add(34);
   s.add(null);
   s.add(56);
   System.out.println(s);
}
}
