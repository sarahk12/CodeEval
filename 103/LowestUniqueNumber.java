/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/103/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LowestUniqueNumber {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] str = line.split(" ");
				int[] n = new int[10];
				for (int i = 0; i < str.length; i++) {
					int num = Integer.parseInt(str[i]);
					n[num]++;
				}
				int min = 0;
				for (int i = 0; i < n.length; i++) {
					if (n[i]== 1) {
						min = i;
						break;
					}
				}
				int loc = 0;
				for (int i = 0; i < str.length; i++) {
					if (str[i].equals("" + min)) {
						loc = i + 1;
						break;
					}
				}
				System.out.println(loc);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}