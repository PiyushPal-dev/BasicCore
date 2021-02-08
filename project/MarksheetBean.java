package in.com.project;

public class MarksheetBean {
private int id;
private String RollNo;
private String FirstName;
private String LastName;
private int Physics;
private int Chemistry;
private int Maths;

  public MarksheetBean() {}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRollNo() {
	return RollNo;
}

public void setRollNo(String rollNo) {
	RollNo = rollNo;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public int getPhysics() {
	return Physics;
}

public void setPhysics(int physics) {
	Physics = physics;
}

public int getChemistry() {
	return Chemistry;
}

public void setChemistry(int chemistry) {
	Chemistry = chemistry;
}

public int getMaths() {
	return Maths;
}

public void setMaths(int maths) {
	Maths = maths;
}
  
  
}
