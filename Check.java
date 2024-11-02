/*
 Sahar Hazem Hatem Hmidat 
 1202038
 3L
 */
package project;

public class Check extends CustomerPayment implements Payable{

	public static final int CASHIER=1;
	public static final int CERTIFIED=2;
	public static final int PERSONAL=3;
	private int accountNumber;
	private double accountBalance;
	private int type;
	
	public Check() {
	}
	
	public Check(String customerName, int customerId, double amount,int accountNumber, double accountBalance, int type) {
		super(customerName,customerId,amount);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.type = type;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	@Override
	public boolean isAuthorized() {
		if(type==CASHIER  || super.amount <=accountBalance)
			return true;
		return false;
	}
	public void deductAmountFromBalance() {
		if(isAuthorized())
		accountBalance-=super.amount;
	}
	
	@Override
	protected double calculatePayment( ) {
		if(type==CERTIFIED || type==PERSONAL)
			deductAmountFromBalance();
		return super.amount;
	}

	@Override
	public String toString() {
		return "Check [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", type=" + type + ", customerName=" +super.customerName+", customerId=" +super.customerId+", amount=" +super.amount+ "]";
	}
	
	@Override
	public void printPaymentInfo() {
		System.out.print(toString());
		System.out.println(" Payment = "+calculatePayment());
	}

}

	
