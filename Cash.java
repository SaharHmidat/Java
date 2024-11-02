/*
 Sahar Hazem Hatem Hmidat 
 1202038
 3L
 */
package project;


public class Cash extends CustomerPayment{
	private double discountRate;
		
	public Cash() {
	}
	

	public Cash(String customerName, int customerId, double amount,double discountRate) {
		super(customerName,customerId,amount);
		this.discountRate = discountRate;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	protected double calculatePayment() {
		
		double firstAmount=(super.amount *(discountRate/100));
		return super.amount-firstAmount;
	}
	
	@Override
	public String toString() {
		return "Cash [discountRate=" + discountRate + ", customerName=" +super.customerName+ ", customerId=" +super.customerId+ ", amount=" +super.amount+ "]";
	}
	@Override
	public void printPaymentInfo() {
		System.out.print(toString());
		System.out.println(" Payment = "+calculatePayment());
	}
}
