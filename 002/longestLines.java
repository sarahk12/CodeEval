/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/2/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class longestLines {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			ArrayList<String> lines = new ArrayList<String>();
			boolean first = true;
			int nums = 0;
			while ((line = infile.readLine()) != null) {
				if (first == true) {
					nums = Integer.parseInt(line);
					first = false;
				}
				else 
					lines.add(line);
			}
			infile.close();			
			int[] lengths = new int[lines.size()];
			for (int i = 0; i < lines.size(); i++) {
				lengths[i] = lines.get(i).length();
			}
			Arrays.sort(lengths);
			for (int i = 0; i < nums; i++) {
				int max = lengths[lengths.length - i - 1];
				for (int j = 0; j < lines.size(); j++) {
					if (max == lines.get(j).length())
						System.out.println(lines.get(j));
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}