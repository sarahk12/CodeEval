/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/74/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class minCoins {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int num = Integer.parseInt(line);
				int coins = 0;
				while (num > 4) {
					coins++;
					if(num > 4)
						num = num - 5;
				}
				while (num > 2) {
					coins++;
					if (num > 2)
						num = num - 3;
				}
				if (num > 0)
					coins = coins + num;
				System.out.println(coins);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}