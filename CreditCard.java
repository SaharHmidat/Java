/*
 Sahar Hazem Hatem Hmidat 
 1202038
 3L
 */
package project;
import java.util.Date;

public class CreditCard extends CustomerPayment implements Payable {
	
	private double chargingFee;
	private Date expiryDate;
	

	public CreditCard() {
	
	}
	

	public CreditCard(String customerName, int customerId, double amount,double chargingFee, Date expiryDate) {
		super(customerName,customerId,amount);
		this.chargingFee = chargingFee;
		this.expiryDate = expiryDate;
	}


	public double getChargingFee() {
		return chargingFee;
	}


	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	

	@Override
	public boolean isAuthorized() {
		Date currentDate=new Date(); 
		if(currentDate.compareTo(expiryDate)<=0 )
			return true;
		return false;
	}


	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryDate=" + expiryDate + ", customerName=" +super.customerName+ ", customerId=" +super.customerId+ ", amount=" +super.amount+ "]";
	}
	
	@Override
	protected double calculatePayment( ) {
		return super.amount +chargingFee ;
	}
	@Override
	public void printPaymentInfo() {
		System.out.print(toString());
		System.out.println(" Payment = "+calculatePayment());
	}

}
