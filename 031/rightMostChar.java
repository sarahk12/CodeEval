/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/31/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class rightMostChar {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] arr = line.split(",");
				String[] word = arr[0].split("");
				int i = 0;
				for (i = word.length - 1; i > -1; i--) {
					if (word[i].compareTo(arr[1]) == 0) {
						System.out.println(i - 1);
						break;
					}
					else if (i == 0) {
						System.out.println("-1");
						break;
					}
				}
				
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}