package Learn_Again;

import java.util.Scanner;

//inheritance parent class
public class Parent {

	protected int balance = 15000;
	// constant scanner variable to be used throughout the program
	protected final Scanner input = new Scanner(System.in);
	public static int count = 1;

	// method for displaying ATM options
	public void Options() {
		System.out.println("Welcome To GTB, Please Enter Your Pin");
		int pin;
		pin = input.nextInt();
		if (pin >= 0000 && pin <= 9999) {
			StringBuilder sb = new StringBuilder();

			sb.append("Choose an Option\n").append("1: Withdrawl\n").append("2: Deposit\n")
					.append("3: Check Balance\n");

			System.out.println(sb.toString());
		} else {
			System.out.println("Wrong Pin");

			count++;

			if (count <= 3) {
				Options();
			} else{
				System.out.println("Too Many Tries, Card Seized");
			}
		}
	}

}
