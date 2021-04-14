package Learn_Again;

//inheritance child class
public class Child extends Parent {
	// child constructor
	public Child() {

		Options();
		atm();

	}

	// ATM method to call Withdraw, Deposit,or Balance Method
	public void atm() {
		// scanner variable for taking input from users choice
		int choice = input.nextInt();
		if (choice == 1) {
			Withdrawl();
		} else if (choice == 2) {
			Deposit();
		} else if (choice == 3) {
			Balance();
		} else {
			StringBuilder s = new StringBuilder();
			s.append("Sorry The Option: ").append(choice).append(" Is not avaliable").append("\n");
			System.out.println(s.toString());
			Options();
		}
	}

	// withdraw method
	private void Withdrawl() {
		System.out.println("Enter the amount you want to withdrawl\n");
		int amount = input.nextInt();
		if (amount <= balance) {
			balance = balance - amount;
			StringBuilder s = new StringBuilder();
			s.append("Your new Balance is: ").append(balance).append("\n");
			System.out.println(s.toString());
		} else {
			System.out.println("Insufficient Funds\n");
		}
		System.out.println("Would You Like To Make Another Transaction 1 Yes, 2 No");
		int transaction = input.nextInt();
		if (transaction == 1) {
			Options();
		} else if (transaction == 2) {
			System.out.println("Thank You Come Again");
		} else {
			System.out.println("Sorry No Such Option Exist");
		}

	}

	// deposit method
	private void Deposit() {
		StringBuilder s = new StringBuilder();
		System.out.println("how much would you like to deposit\n");
		int amount2 = input.nextInt();
		balance = amount2 + balance;
		s.append("Your new balance is: ").append(balance).append("\n");
		System.out.println(s.toString());

		System.out.println("Would You Like To Make Another Transaction 1 Yes, 2 No");
		int transaction = input.nextInt();
		if (transaction == 1) {
			Options();
		} else if (transaction == 2) {
			System.out.println("Thank You Come Again");
		} else {
			System.out.println("Sorry No Such Option Exist");
		}

	}

	// balance method
	private void Balance() {
		StringBuilder s = new StringBuilder();
		s.append("Your Balance is: ").append(balance).append("\n");
		System.out.println(s.toString());
		System.out.println("Would You Like To Make Another Transaction 1 Yes, 2 No");
		int transaction = input.nextInt();
		if (transaction == 1) {
			Options();
		} else if (transaction == 2) {
			System.out.println("Thank You Come Again");
		} else {
			System.out.println("Sorry No Such Option Exist");
		}

	}

	public static void main(String[] args) {
		// Child constructor
		new Child();

	}
}
