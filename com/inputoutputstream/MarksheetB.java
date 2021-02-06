package com.inputoutputstream;

import java.io.Serializable;

public class MarksheetB implements Serializable{
		String name= null;
	String address = null;
		
	public MarksheetB() {}
	public MarksheetB(String name, String address) {
		this.name=name;
		this.address=address;
		
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

	

}
