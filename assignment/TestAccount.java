package assignment;

public class TestAccount {
public static void main(String[] args) {
	Account a= new Account();
	//a.setname("Aakash");
	a.setaccNo(678);
	a.setbalance(1000);
	//a.deposit(500);
	//a.withdraw(600);
	Account b= new Account();
	b.setname("Rakesh");
	b.setaccNo(789);
	b.setbalance(2000);
	//b.withdraw(500);
	//b.withdraw(1600);
	a.FundTransfer(500,789);
}

}


