public class ATMRunner {
	
	public static void main(String[] args) {
		Account banker1 = new Account("Bob", 1234, 100);
		System.out.println(banker1.checkBalance());
		banker1.withdraw(50);
		System.out.println(banker1.checkBalance());
		System.out.println(banker1.checkPin());
		System.out.println(banker1.checkName());
		Account banker2 = new Account("Alice", 3333, 250);
		System.out.println(banker2.checkBalance());
		banker2.withdraw(50);
		System.out.println(banker2.checkBalance());
		System.out.println(banker2.checkPin());
		System.out.println(banker2.checkName());
		Account banker3 = new Account("JT", 0001, 999999999);
		System.out.println(banker3.checkBalance());
		banker3.withdraw(50);
		System.out.println(banker3.checkBalance());
		System.out.println(banker3.checkPin());
		System.out.println(banker3.checkName());
	}

}