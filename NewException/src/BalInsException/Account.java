package BalInsException;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalInsException {
		if (balance < money) {
			throw new BalInsException("�ܰ���� : " + (money - balance) + " ���ڶ�");
		}
		balance -= money;
	}
}
