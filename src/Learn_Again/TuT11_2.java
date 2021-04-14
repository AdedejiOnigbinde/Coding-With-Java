package Learn_Again;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Serialization

public class TuT11_2 {

	public static void main(String[] args) {
		System.out.println("Writing...");
		TuT11_1[] human = {new TuT11_1("M",6.7,"Andy"),new TuT11_1("M",6.7,"Barkley"),new TuT11_1("F",6.7,"Joan"),new TuT11_1("F",6.7,"Sharon")};
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ByteStream.ser"))){
			output.writeObject(human);
			
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}catch(IOException ex){
			System.out.println("File Could Not Be Opened");
		}

	}

}
