package Learn_Again;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


//Deserialization
public class TuT11_3 {
	public static void main(String[] args) {
System.out.println("Reading...");
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("ByteStream.ser"))){
			TuT11_1[] human = (TuT11_1[])input.readObject();
			for(TuT11_1 homo: human){
				System.out.println(homo);
			}
			input.close();
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}catch(IOException ex){
			System.out.println("File Could Not Be Opened");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
