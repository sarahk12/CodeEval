/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/83/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class beautifulStrings {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			
	
			while ((line = infile.readLine()) != null) {
				int[] numOfChars = new int[27];
				int i = 0;
				line = line.replaceAll("[^a-zA-Z]", "");
				line = line.toLowerCase();
				for (i = 0; i < line.length(); i++) {
					int c = (line.charAt(i) - 0) - 96;
					numOfChars[c]++;
				}
				Arrays.sort(numOfChars);
				i = 0;
				int alpha = 26, total = 0;
				for (i = numOfChars.length - 1; numOfChars[i] != 0; i--) {
					total = total + (alpha-- * numOfChars[i]);
				}
				System.out.println(total);
			}
			infile.close();
	
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}