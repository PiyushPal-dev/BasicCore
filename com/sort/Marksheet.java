package com.sort;

public class Marksheet implements Comparable<Marksheet>{
   public String rollNo;
   public String fName;
   public String lName;
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
@Override
public int compareTo(Marksheet m) {
	return rollNo.compareTo(m.rollNo);
}
public String toString() {
	return rollNo+","+fName+","+lName;
}
   
}
