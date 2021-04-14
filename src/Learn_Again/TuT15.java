package Learn_Again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//Sorting List
public class TuT15 {

	ArrayList<String> Name = new ArrayList<String>();
	ArrayList<Integer> Numb = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);

	public void ListFillString() {
		System.out.println("Number Of Names You Would Like To Enter");
		int NameNum = input.nextInt();
		for (int num = 1; num <= NameNum; num++) {
			System.out.println("Enter Name: " + num);
			String Names = input.nextLine();
			Name.add(Names);
		}
		//Sorting In Natural Order
		Collections.sort(Name);
		System.out.println(Name);
		//Sorting In Custom Order
		Collections.sort(Name, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return -s1.compareTo(s2);
			}

		});
		System.out.println("Backwards "+Name);
	}

	public void ListFillInteger() {
		System.out.println("Number Of Nubers You Would Like To Enter");
		int Num = input.nextInt();
		for (int num = 1; num <= Num; num++) {
			System.out.println("Enter Name: " + num);
			int Numbers = input.nextInt();
			Numb.add(Numbers);
		}
		Collections.sort(Numb);
		System.out.println(Numb);
		//Sorting In Custom Order
		Collections.sort(Numb, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return -i1.compareTo(i2);
			}

		});
		System.out.println("Backwards: "+Numb);
	}

	public static void main(String[] args) {
		TuT15 test = new TuT15();
		test.ListFillInteger();
		test.ListFillString();
	}

}
