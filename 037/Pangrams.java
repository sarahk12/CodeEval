/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/37/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pangrams {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				line = line.toLowerCase();
				boolean[] alpha = new boolean[26];
				boolean print = false;
				for (int i = 0; i < line.length(); i++) {
					int n = Character.getNumericValue(line.charAt(i)) - 10;
					if (n > -1 && n < 26) alpha[n] = true; 
				}
				for (int i = 0; i < alpha.length; i++) {
					if (alpha[i] != true) {
						System.out.print(Character.toChars(i + 97));
						print = true;
					}
				}
				if (print == false) System.out.println("NULL");
				else System.out.println();
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}