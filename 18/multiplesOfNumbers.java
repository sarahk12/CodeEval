/*
@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
Description of problem at: https://www.codeeval.com/open_challenges/18/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class multiplesOfNumbers {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
	
			while ((line = infile.readLine()) != null) {
				int comma = -1;
				comma = line.indexOf(",");
				String x = line.substring(0, comma);
				int xx = Integer.parseInt(x);
				String n = line.substring(comma + 1);
				int nn = Integer.parseInt(n);
				int total = 0;
				for (int counter = 0; total < xx; counter++) {
					total = nn * counter;
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