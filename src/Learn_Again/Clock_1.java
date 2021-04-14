package Learn_Again;

import java.util.Scanner;

// Getter and Setter Methods and Constructor
public class Clock_1 {
	private Scanner input = new Scanner(System.in);
	private int Hour, Minute, Second;

	// Constructor
	public Clock_1() {
		System.out.println("Please Set The Time");
		System.out.println("Hour");
		Hour = input.nextInt();
		System.out.println("Minute");
		Minute = input.nextInt();
		System.out.println("Second");
		Second = input.nextInt();

		Time();
	}

	// Set Second Method
	private void setSec(int Second) {
		this.Second = Second;
	}

	// Set Minute Method
	private void setMin(int Minute) {
		this.Minute = Minute;
	}

	// Set Hour Method
	private void setHr(int Hour) {
		this.Hour = Hour;
	}

	// Get Second Method
	private int getSecond() {
		return Second;
	}

	// Get Minute Method
	private int getMinute() {
		return Minute;
	}

	// Get Hour Method
	private int getHour() {
		return Hour;
	}

	// Output Time Method
	public void Time() {
		System.out.println("The Time is : " + Hour + ":" + getMinute() + ":" + getSecond());
	}

	public static void main(String[] args) {
		// Objects of Clock_1
		new Clock_1();

	}

}
