package Learn_Again;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TuT10_1 {
	// Constant Scanner Object
	private Scanner input = new Scanner(System.in);

	// Constructor
	public void start() {
		System.out.println("Would You Like To Open A New Text File?\nYes Or No?");
		// Variable For Answer To Question
		String answer;
		// Scanner Object For Answer Variable
		answer = input.nextLine();
		// If, Else If, And Else Statement For Answer
		if (answer.equals("yes")) {
			// Calling Open File Method
			OpenFile();
		} else if (answer.equals("no")) {
			System.out.println("Thank You Come Again");
		} else {
			System.out.println("Option Not Available");
			start();
		}

	}

	// Open File Method
	private void OpenFile() {
		System.out.println("What Would You Like To Name The File");
		// Variable For File Name
		String FileName;
		// Scanner Object for Final Name
		FileName = input.nextLine();
		// Creation Of File Using Name Given By User Input
		File File1 = new File(FileName + ".txt");
		// Calling Of Write File Method
		WriteFile(File1);
	}

	// Write To File Method
	private File WriteFile(File file) {
		// Try With Resources
		try (BufferedWriter Write = new BufferedWriter(new FileWriter(file))) {
			System.out.println("Please Write Into The File");
			// String Variable Initialized With The Word "YES" In Order For
			// WHILE Loop To Execute Once
			String Continue = "yes";
			// WHILE Loop For Continuous Writing To File
			while (Continue.equals("yes")) {
				// String Variable For User Input
				String Content;
				// Scanner Object For User Input For Writing To File
				Content = input.nextLine();
				// Writes String Gotten From User Input To File
				Write.write(Content);
				// Creates New Line
				Write.newLine();
				System.out.println("Would You Like To Continue Writing\nYes Or No?");
				// Scanner Object For Answer For User To Continue Writing To
				// File
				Continue = input.nextLine();
			}
			// Exception For File Writing Error
		} catch (IOException e) {
			System.out.println("Can Not Write Into File: ");
		}
		// Print Statement To Signify That File Was Saved
		System.out.print("Saved\n");
		System.out.print("Would You Like To Read What You Wrote?\nYes Or No\n");
		// String Variable For User's Answer
		String answer2;
		// Scanner Object For User Input
		answer2 = input.nextLine();
		// If, Else If, and Else For User Answer
		if (answer2.equals("yes")) {
			// Calling Read File Method
			ReadFile(file);
		} else if (answer2.equals("no")) {
			System.out.println("Thank You Come Again");
		} else {
			System.out.println("Not An Option");
			WriteFile(file);
		}
		return null;
	}

	// Read File Method
	private File ReadFile(File file2) {
		// Try With Resources
		try (BufferedReader Read = new BufferedReader(new FileReader(file2))) {
			// String Variable
			String line;
			while ((line = Read.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could Not Find File: " + file2);
		} catch (IOException e) {
			System.out.println("Could Not Read File: " + file2);
		}
		return null;

	}
	
	public static void main(String args[]){
		TuT10_1 begin = new TuT10_1();
		begin.start();
	}


}
