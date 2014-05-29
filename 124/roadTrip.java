/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/124/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class roadTrip {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] str = line.split(";");
				int[] n = new int[str.length];
				for (int i = 0; i < str.length; i++) {
					String[] s = str[i].split(",");
					n[i]= Integer.parseInt(s[1]);
				}
				Arrays.sort(n);
				System.out.print(n[0]);
				for (int i = 1; i < n.length; i++) {
					System.out.print("," + (n[i] - n[i - 1]));
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