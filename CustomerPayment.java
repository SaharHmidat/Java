/*
 Sahar Hazem Hatem Hmidat 
 1202038
 3L
 */
package project;

public abstract class CustomerPayment implements Comparable<Object> {

	protected String customerName;
	protected int customerId;
	protected double amount;
	
	public CustomerPayment() {
		
	}
	
	public CustomerPayment(String customerName, int customerId, double amount) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	abstract protected double calculatePayment();
		
	@Override
	public int compareTo(Object o) {
		
		if(this.calculatePayment()== ((CustomerPayment) o).calculatePayment())
			return 0;
		else if (this.calculatePayment()> ((CustomerPayment) o).calculatePayment())
			return 1;
		else
		return -1;
	}
	
	@Override
	public String toString() {
		return "CustomerPayment [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount
				+ "]";
	}
	
	 void printPaymentInfo() {
		System.out.print(toString());
	}
}
