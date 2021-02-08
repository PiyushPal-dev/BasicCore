package in.com.project;

public class TestMarksheet {
 public static void main(String[] args) throws Exception {
	//testAdd();
	//testUpdate();
	//testDelete();
	//testGet();
	//testMeritList();
     testSearch();
 }

private static void testSearch() throws Exception {
	MarksheetBean b = new MarksheetBean();
	MarksheetModel MM= new MarksheetModel();
	MM.Search(b);
	
}

private static void testMeritList() throws Exception {
	MarksheetBean b = new MarksheetBean();
	
	MarksheetModel MM= new MarksheetModel();
	MM.Meritlist(b);
}

private static void testGet() throws Exception {
  MarksheetBean b = new MarksheetBean();
  b.setRollNo("103");

   MarksheetModel MM= new MarksheetModel();
   MM.Get(b);
}

private static void testDelete() throws Exception {
	MarksheetBean b = new MarksheetBean();
	b.setRollNo("104");
	
	MarksheetModel MM =  new MarksheetModel();
	MM.delete(b);
	
}

private static void testUpdate() throws Exception {
	MarksheetBean b= new MarksheetBean();
	b.setFirstName("Sara");
	b.setId(2);
	
	MarksheetModel MM = new MarksheetModel();
    MM.update(b);
	
}

private static void testAdd() throws Exception {
	MarksheetBean b= new MarksheetBean();
	b.setId(4);
	b.setRollNo("104");
	b.setFirstName("Raina");
	b.setLastName("R");
	b.setPhysics(56);
	b.setChemistry(87);
	b.setMaths(97);
	
	MarksheetModel bean= new MarksheetModel();
	bean.add(b);
	
}
}
