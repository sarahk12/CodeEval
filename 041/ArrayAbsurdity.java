/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/41/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayAbsurdity {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int duplicate = 0;
				String[] splitStrings = line.split(";");
				int n = Integer.parseInt(splitStrings[0]);
				int[] nums = new int[n];
				String[] numStrings = splitStrings[1].split(",");
				for (int i = 0; i < numStrings.length; i++) {
					int num = Integer.parseInt(numStrings[i]);
					if (++nums[num] == 2) {
						duplicate = num;
						break;
					}
				}
				System.out.println(duplicate);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}