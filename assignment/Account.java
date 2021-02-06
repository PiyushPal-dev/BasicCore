package assignment;

public class Account {
	private String name;
	private double accNo;
	private double balance;

	public String getname() {
		return name;
	}

	public void setname(String n) {
		name = n;
	}

	public double getaccNo() {
		return accNo;
	}

	public void setaccNo(double i) {
		accNo = i;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double b) {
		balance = b;
	}

	public void deposit(double d) {
		balance = balance + d;
		System.out.println("Deposited Successfully: " + getbalance());
	}

	public void withdraw(double w)  {
		if(500>balance-w) {
			try {
				InsuficientFundException e= new InsuficientFundException();
				throw e;
			}
			catch(InsuficientFundException i) {
				System.out.println(i.getMessage());
			}
		}else {
			balance=balance-w;
			System.out.println("Withdraw Successfull. Current Balance:" +balance);
			}
	}
    public void FundTransfer(double transferAmount, double transferTo) {
    	
    	balance=balance-transferAmount;
    	transferTo=accNo;
    	System.out.println("Amount" +balance);
    }
	
}