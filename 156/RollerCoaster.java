/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/156/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RollerCoaster {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				boolean toUpper = true;
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
						if (toUpper == true) {
							System.out.print(Character.toUpperCase(c));
							toUpper = false;
						}
						else {
							System.out.print(Character.toLowerCase(c));
							toUpper = true;
						}	
					}
					else
						System.out.print(c);
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