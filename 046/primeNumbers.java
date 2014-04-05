/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/46/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class primeNumbers {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int num = Integer.parseInt(line);
				if (num > 4)
					System.out.print("2,3");
				for (int i = 4; i < num; i++) {
					if (i % 2 == 0) continue;
					for (int j = 3; j <= num; j+=2) {
						if (i % j == 0 && i != j)
							break;
						if (j == i)
							System.out.print("," + i);
					}
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