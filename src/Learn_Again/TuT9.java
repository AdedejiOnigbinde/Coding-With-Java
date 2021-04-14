// Try with resources
package Learn_Again;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TuT9 {

	public static void main(String[] args) {
		File file1 = new File("Text.txt");
		// Try with resource line
		try(BufferedReader Read = new BufferedReader(new FileReader(file1))){
			String sentence;
			while((sentence = Read.readLine()) !=null){
				System.out.println(sentence);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can Not Find File: "+ file1);
		} catch (IOException e) {
			System.out.println("Can not Read File: "+ file1 );
		}

	}

}
