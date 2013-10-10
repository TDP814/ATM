public class ATM {

	private Atm[];
	//State
	//	Accounts

	//Behavior
	//	Login(String name, int pin)
	//		Check Atm for name and pin
	public login(String name, int pin){
		for (int i=0; i>=name.length; i++) {
			if (Atm[i].name == name) {
				if (Atm[i].pin == pin) {
					return Atm[i];
				}
			}
		}
	}
}