/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/152/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int age = Integer.parseInt(line);
				if (age >= 0 && age <= 2) System.out.println("Still in Mama's arms");
				else if (age >= 3 && age <= 4) System.out.println("Precschool Maniac");
				else if (age >= 5 && age <= 11) System.out.println("Elementary school");
				else if (age >= 12 && age <= 14) System.out.println("Middle school");
				else if (age >= 15 && age <= 18) System.out.println("High school");
				else if (age >= 19 && age <= 22) System.out.println("College");
				else if (age >= 23 && age <= 65) System.out.println("Working for the man");
				else if (age >= 66 && age <= 100) System.out.println("The Golden Years");
				else System.out.println("This program is for humans");
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
