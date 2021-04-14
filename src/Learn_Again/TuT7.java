package Learn_Again;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList and anonymous class

class data{
	protected final Scanner sc = new Scanner(System.in);
	protected ArrayList<String> database = new ArrayList<>();
	protected String Name;
	
	public data(){
		InputName();
		OutputNames();
	}
	
	public void InputName(){
		for(int redun=0;redun<=5;redun++){
			System.out.println("What Is Your Name?");
			Name = sc.nextLine();
			database.add(Name);
		}
	
	}
	
	public ArrayList<String> GetNames(){
		return database;
	}
	
	public void OutputNames(){
		System.out.println(GetNames());
	}
}




public class TuT7 {

	public static void main(String[] args) {
		//annonymous method
		new data(){
			public void InputName(){
				for(int redun=0;redun<=1;redun++){
					System.out.println("What Is Your grace?");
					Name = sc.nextLine();
					database.add(Name);
				}
			}
		};
		

	}

}
