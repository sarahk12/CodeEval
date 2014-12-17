/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/147/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LettercasePercentRatio {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int lowercase = 0;
				int uppercase = 0;
				double ratio = 0.0;
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (Character.isUpperCase(c)) uppercase++;
					else lowercase++;
				}
				if (lowercase == 0) System.out.print("lowercase: 0.00");
				else {
					ratio = (double)(lowercase/(double)(lowercase + uppercase)) * 100;
					System.out.print("lowercase: ");
					System.out.printf("%.2f", ratio);
				}
				if (uppercase == 0) System.out.print(" uppercase: 0.00");
				else {
					ratio = (double)(uppercase/(double)(lowercase + uppercase)) * 100;
					System.out.print(" uppercase: ");
					System.out.printf("%.2f", ratio);
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