package Learn_Again;
//Complex Data Types
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TuT19 {
	public static String level[] = { "100", "200", "300" };
	public static String student[][] = { 
			{ "john", "gbola", "boyega", "kamdi" },
			{ "chris", "jennifer", "nonso", "greg" }, 
			{ "payton", "brady", "nasir", "george" }, 
		};

	public static void main(String[] args) {
		Map<String, Set<String>> year = new HashMap<>();

		for (int i = 0; i < level.length; i++) {
			String part = level[i];
			String pupil[] = student[i];

			Set<String> student = new LinkedHashSet<String>();
			for (String students : pupil) {
				student.add(students);
			}
			year.put(part, student);
		}
		for (String part : year.keySet()) {
			System.out.print(part);
			System.out.print(": ");
			Set<String> years = year.get(part);

			for (String students : years) {
				System.out.print(students);
				System.out.print(" ");
			}
			System.out.println();

		}

	}
}
