/*
@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
Description of problem at: https://www.codeeval.com/open_challenges/20/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lowerCase {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
	
			while ((line = infile.readLine()) != null) {
				String newLine = line.toLowerCase();
				System.out.println(newLine);
			}
	
			infile.close();
	
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}