package Learn_Again;
//ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class TuT12 {
	ArrayList<String> names = new ArrayList<String>();
	Scanner input = new Scanner(System.in);

	private void OptionChooser() {
		System.out.println("Choose 1 for Data Entry and 2 To Read Data Entry");
		int option;
		option = input.nextInt();
		if (option == 1) {
			DataEntry();
		} else if (option == 2) {
			ReadEntry();
		} else {
			System.out.println("Wrong Option");
			OptionChooser();
		}

	}

	private void DataEntry() {
		System.out.println("Please Enter A Name");
		String name;
		name = input.next();
		names.add(name);
		System.out.println("Would You Like To Enter Another Name Yes/No?");
		String option2;
		option2 = input.next();
		if (option2.equals("yes")) {
			DataEntry();
		} else if (option2.equals("no")) {
			System.out.println("To Read The Names press 1 To Quit Press 2");
			int option3;
			option3 = input.nextInt();
			if (option3 == 1) {
				ReadEntry();
			} else if (option3 == 2) {
				System.out.println("Thank You come Again");
			} else {
				System.out.println("No Option Available");
			}

		}
	}

	private void ReadEntry() {
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

	public static void main(String[] args) {
		TuT12 start = new TuT12();
		start.OptionChooser();
	}
}
