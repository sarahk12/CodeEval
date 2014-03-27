/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/67/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hexToDecimal {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
			
			while ((line = infile.readLine()) != null) {
				String[] hex = line.split("");
				int total = 0;
				for (int i = (hex.length - 1); i > 0; i--) {
					for (int j = 0; j < hexArray.length; j++) {
						if (hex[i].compareTo(hexArray[j]) == 0) {
							total = (int) (total + (Math.pow(16, hex.length - 1 - i) * j));
						}
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