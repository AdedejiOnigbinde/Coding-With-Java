package Learn_Again;

//Hash Map
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TuT13 {
	Map<Integer, String> Id = new HashMap<Integer, String>();
	final Scanner input = new Scanner(System.in);
	Random num = new Random();
	int IdGen;

	public void IdGenerator() {
		System.out.println("Enter The Number Of Names You Would Lie To Give An I.D ");
		int NumNames = input.nextInt();
		for(int num1=1; num1<=NumNames;num1++){
			System.out.println("Enter Name: "+num1);
			String Name = input.next();
			IdGen = num.nextInt(1000);
			Id.put(IdGen, Name);
		}
		IdPrinter();
	}

	public void IdPrinter() {
		for (Map.Entry<Integer, String> entry : Id.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " " + value);
		}
	}

	public static void main(String[] args) {
		TuT13 man = new TuT13();
		man.IdGenerator();
	}
}
