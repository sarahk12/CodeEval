/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/131/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SplitTheNumber {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] splits = line.split(" ");
				if (splits[1].contains("-")) {
					int minus = splits[1].indexOf("-");
					int first = Integer.parseInt(splits[0].substring(0, minus));
					int second = Integer.parseInt(splits[0].substring(minus, splits[0].length()));
					System.out.println(first - second);
				}
				else if (splits[1].contains("+")) {
					int plus = splits[1].indexOf("+");
					int first = Integer.parseInt(splits[0].substring(0, plus));
					int second = Integer.parseInt(splits[0].substring(plus, splits[0].length()));
					System.out.println(first + second);
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