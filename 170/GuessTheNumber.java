/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/170/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GuessTheNumber {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] partsString = line.split(" ");
				int range = Integer.parseInt(partsString[0]);
				int guess = range;
				int top = range;
				int bottom = 0;

				guess = (int) Math.ceil(range/2.0);
				
				// If guess is exactly half of range on the first try.
				if (partsString.length == 2) {
					System.out.println(guess);
					continue;
				}
				
				for (int i = 1; i < partsString.length - 1; i++) {
					// If computer says 'Lower'
					if (partsString[i].length() == 5) {
						top = guess - 1;
						guess = (int) Math.ceil((top + bottom)/2.0);
					}
					// Else computer says 'Higher'
					else {
						bottom = guess + 1;
						guess = (int) Math.ceil((top + bottom)/2.0);
					}
				}
				System.out.println(guess);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}