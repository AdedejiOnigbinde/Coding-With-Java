package Learn_Again;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Sets And Passing Objects Through Sets
public class TuT14 {

	final Scanner input = new Scanner(System.in);
	final Set<String> Names = new HashSet<String>();

	public void PopulateSet() {
		System.out.println("Please Enter The Number Of Names You Would Lie To Input");
		int amount = input.nextInt();
		for (int num = 1; num <= amount; num++) {
			System.out.println("Enter Name: " + num);
			String Name2 = input.next();
			Names.add(Name2);
		}
		System.out.println(Names);
	}

	public static void main(String[] args) {

		TuT14 test = new TuT14();
		test.PopulateSet();
		
		//Creating Objects With Names
		Objectsets objn1 = new Objectsets("Clinton");
		Objectsets objn2 = new Objectsets("Barbra");
		Objectsets objn3 = new Objectsets("Clinton");
		Objectsets objn4 = new Objectsets("Nancy");

		Set<Objectsets> Names4 = new HashSet<Objectsets>();

		// Passing An Object Into The Set
		Names4.add(objn1);
		Names4.add(objn2);
		Names4.add(objn3);
		Names4.add(objn4);

		System.out.println(Names4);
	}
}

class Objectsets {
	String Name;

	public Objectsets(String Name) {
		this.Name = Name;
	}

	public String toString() {
		return "Name: " + Name;
	}

	// Checks For Redundant Data Passed Into The Object
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objectsets other = (Objectsets) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

}
