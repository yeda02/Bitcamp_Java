package study;

public class SmartPhone extends CellPhone1 {
	// Field
	private boolean isMonthlyFixedRate = false;
	private int monthlyFixedFee;

	// Constructor
	public SmartPhone() {
	}

	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}

	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}

	// Method
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}

	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public void calculateTotalFee() {
		if (isMonthlyFixedRate) {
			System.out.println("�������� " + monthlyFixedFee + "���� ������Դϴ�.");
			setTotalFee(monthlyFixedFee+getFeePerCallTime());
		}else {
		super.calculateTotalFee();	
	//	setTotalFee(getTotalCallTime()*getFeePerCallTime()+monthlyFixedFee);
		}
	}
}// end of class
