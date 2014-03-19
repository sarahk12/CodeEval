/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/113/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class multiplyLists {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
	
			while ((line = infile.readLine()) != null) {
				int[] nums = new int[line.length()];
				int bar = 0, i = 0;
				for (String str : line.split(" ")) {
					if (str.compareTo("|") == 0) {
						bar = i;
					}
					else {
						nums[i] = Integer.parseInt(str);
						i++;
					}
				}
				for (int j = 0; bar < i; j++) {
					System.out.print((nums[j] *  nums[bar++]) + " ");
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