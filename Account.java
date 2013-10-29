public class Account {
	
	private String name;
	private String pin;
	private int balance;

	public Account(String name, String pin, int balance) {
		setBalance(balance);
		setPin(pin);
		setName(name);

	}

	public void setBalance(int balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public void setPin(String pin) {
		if (pin.length() == 4) {
			this.pin = pin;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public int checkBalance() {
		return this.balance;
	}

	public void withdraw(int withdraw) {
		if (balance > withdraw) {
			this.balance = balance - withdraw;
		} else {
			System.out.println("I am sorry. You do not have that much money in your account.");
		}
	}

	public String checkName() {
		return this.name;
	}

	public String checkPin() {
		return this.pin;
	}

}