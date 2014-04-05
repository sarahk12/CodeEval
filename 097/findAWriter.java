/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/97/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class findAWriter {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				if (line.compareTo("") == 0) continue;
				String[] parts = line.split("\\|");
				String word = parts[0];
				String[] locs = parts[1].split(" ");
				for (int i = 1; i < locs.length; i++) {
					int loc = Integer.parseInt(locs[i]);
					System.out.print(word.charAt(loc - 1));
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