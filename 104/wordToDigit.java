/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/104/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordToDigit {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
			while ((line = infile.readLine()) != null) {
				String[] words = line.split(";");
				for (int i = 0; i < words.length; i++) {
					for (int j = 0; j < numbers.length; j++) {
						if (words[i].compareTo(numbers[j]) == 0) {
							System.out.print(j);
							break;
						}
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