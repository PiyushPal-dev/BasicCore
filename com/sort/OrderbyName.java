package com.sort;

import java.util.Comparator;

public class OrderbyName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		return m1.fName.compareTo(m2.fName);
	}

}
