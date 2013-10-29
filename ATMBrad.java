import java.util.Scanner;

public class ATMBrad {
	
	private Account atm[] = new Account [3];
	private Account active;
	private Scanner reader = new Scanner(System.in);
	private boolean worked = false;

	public void login(String name, String pin){
		for (int i = 0; i < atm.length; i++) {
			if (atm[i].checkName().equals(name) && atm[i].checkPin().equals(pin)) {
				active = atm[i];
			}
		}
		if (active != null) {
			interfaceIsGood();
		}
	}

	public void interfaceIsGood(){
		System.out.println();
		System.out.println("Ahoy");
		String input = "";
		while (!(input.equals("logout"))) {
			System.out.println("Enter 'help' for help");
			System.out.println("What would you like to do?");
			input = reader.next();
			if (input.equals("CheckBalance") || input.equals("checkbalance")) {
				System.out.println("Your current balance is: $" + active.checkBalance());
			} else if (input.equals("ChangeBalance") || input.equals("changebalance")) {
				System.out.print("Enter your new balance: $");
				active.setBalance(reader.nextInt());
				System.out.println("Your new balance is: $" + active.checkBalance());
			} else if (input.equals("CheckPIN") || input.equals("checkpin")) {
				System.out.println(active.checkPin());
			} else if (input.equals("ChangePIN") || input.equals("changepin")) {
				System.out.print("Enter your current PIN: ");
				if (reader.next().equals(active.checkPin())) {
					System.out.print("Enter your new PIN: ");
					active.setPin(reader.next());
					System.out.println("Your new PIN is: " + active.checkPin());
				} else {
					System.out.println("I am sorry. You entered the wrong PIN. Please try again.");
				}
			} else if (input.equals("checkname") || input.equals("CheckName")) {
				System.out.println("Your name is: " + active.checkName());
			} else if (input.equals("changename") || input.equals("ChangeName")) {
				System.out.println("Enter your new name");
				active.setName(reader.next());
				System.out.println("Your new name is: " + active.checkName());
			} else if (input.equals("Withdraw") || input.equals("withdraw")) {
				System.out.print("Enter the amount in which you wish to withdraw: $");
				active.withdraw(reader.nextInt());
				System.out.println("Your new balance is: $" + active.checkBalance());
			} else if (input.equals("help") || input.equals("Help")) {
				System.out.println("Command\t\t\tWhat it does");
				System.out.println();
				System.out.println("checkbalance\t\tChecks the balance in your account");
				System.out.println("changebalace\t\tChanges the balance in your accoutnt");
				System.out.println("checkpin\t\tChecks the PIN of your account");
				System.out.println("changepin\t\tChanges the PIN of your accoutnt");
				System.out.println("checkname\t\tChecks the name in your account");
				System.out.println("changename\t\tChanges the name in your accoutnt");
				System.out.println("withdraw\t\tWithdraws money from you account");
				System.out.println("logout\t\t\tLogs you out of your account");
			} else if (input.equals("logout")) {
				System.out.println("You have succesfully logged out. Thank You.");
			} else if (input.substring(0,3).equals("eat")) {
				System.out.println("Nom Nom Nom Nom. That " + input.substring(3, input.length()) + " was delicious!");
			}else {
				System.out.println();
				System.out.println("Invalid Command");
				System.out.println("Enter 'help' for help");
			}
			System.out.println();
		}
		logout();
	}

	public void startATM() {
		String inputName;
		String inputPin;
		System.out.println("Hello and welcome to Padjenbank.");
		while (active == null && !worked) {
			System.out.print("Please enter you name: ");
			inputName = reader.next();
			if (inputName.equals("exit")) {
				System.out.println("Have a great day!");
				worked = true;
			} else {
				System.out.print("Please enter you PIN: ");
				inputPin = reader.next();
				//System.out.println(inputName + " " + inputPin);
				login(inputName, inputPin);
				if (active == null && !worked) {
					System.out.println("I'm sorry. The name and PIN you entered are incorrect. Please try again.");
				}
			}
		}
	}


	public ATMBrad() {
		atm[2] = new Account("JT", "0001", 999999999);
		atm[1] = new Account("Alice", "3333", 250);
		atm[0] = new Account("Bob", "1234", 100);
	}

	public void logout() {
		active = null;
		worked = true;
	}

}