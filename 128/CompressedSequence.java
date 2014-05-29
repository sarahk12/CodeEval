/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/128/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CompressedSequence {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] numStrings = line.split(" ");
				ArrayList<String> doublesList = new ArrayList<String>();
				int j = 0;
				doublesList.add(numStrings[0]);
				for (int i = 1; i < numStrings.length; i++) {
					if (!(numStrings[i].equals(doublesList.get(j)))) {
						j++;
						doublesList.add(numStrings[i]);
					}
				}
				j = 0;
				int i = 0;
				while (j < doublesList.size()) {
					int counter = 0;
					while ((doublesList.get(j).equals(numStrings[i])) && (i < numStrings.length - 1)) {
						counter++;
						i++;
					}
					if (j == doublesList.size() - 1) {
						System.out.print((counter + 1) + " " + doublesList.get(j) + " ");
					}
					else {
						System.out.print(counter + " " + doublesList.get(j) + " ");
					}
					j++;
				}
				System.out.println();
				doublesList.clear();
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}