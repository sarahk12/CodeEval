/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/107/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShortestRepetition {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				boolean[] alpha = new boolean[26];
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					int n = Character.getNumericValue(c) - 10;
					alpha[n] = true; 
				}
				int counter = 0;
				for (int i = 0; i < alpha.length; i++) {
					if (alpha[i] == true) counter++;
				}
				System.out.println(counter);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}