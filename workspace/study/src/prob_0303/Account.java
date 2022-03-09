package prob_0303;

public class Account {

	// Field
	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int balance;
	int money;

	// Constructor
	public Account() {
	}

	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;

	}

	// @Override
	public String toString() {
		if (creditLine) {
			return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��\t [[   -" + creditLineLimit + "�� ���̳ʽ� ����  ]]";
		} else {
			return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��";
		}
	}

	// Method
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
		// System.out.println(balance);
	}

	public void withdraw(int money) throws Exception {
		balance -= money;
		// System.out.println(balance);
		if (creditLine && balance < (-creditLineLimit)) {
			throw new Exception("�ܰ����� ��ݺҰ� �մϴ�");
		} else if (!creditLine && balance < 0) {
			throw new Exception("�ܰ����� ��ݺҰ� �մϴ�");

		}
	}

}