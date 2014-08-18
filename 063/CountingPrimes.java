/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/63/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingPrimes {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] parts = line.split(",");
				int start = Integer.parseInt(parts[0]);
				int end = Integer.parseInt(parts[1]);
				int total = 0;
				for (int i = start; i <= end; i++) {
					for (int j = 2; j <= i; j++) {
						if ((i == 2) || (i == 3) || (i == 5)) {
							total++;
							break;
						}
						else if ((i % j) == 0) break;
						else if (j == (i - 1)) total++;
					}
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