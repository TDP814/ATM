public class Account {
	
	private String name;
	private int pin;
	private int balance;

	public Accounts(String name, int pin, int balance) {
		setBalance(balance);
		setPin(pin);
		setName(name);

	}

	public void setBalance(int balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public void setPin(int pin) {
		if (pin >= 0 && pin <= 9999) {
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
		this.balance = balance - withdraw;
	}

	public String checkName() {
		return this.name;
	}

	public int checkPin() {
		return this.pin;
	}

	public void logout() {

	}

}