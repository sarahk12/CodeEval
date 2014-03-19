/*
@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
Description of problem at: https://www.codeeval.com/open_challenges/93/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class capitalizeWords {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
	
			while ((line = infile.readLine()) != null) {
				int length = line.length();
				for (int i = 0; i < length; i++) {
					int newLength = line.length();
					int space = line.indexOf(" ");
					if (space == -1) {
						space = newLength;
					}
					String first = line.substring(0, 1);
					String partWord = line.substring(1, space);
					first = first.toUpperCase();
					String word = first.concat(partWord);
					System.out.print(word + " ");
					if (space == newLength) {
						break;
					}
					line = line.substring(space + 1);
				}
				System.out.println();
			}
	
			infile.close();
	
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}