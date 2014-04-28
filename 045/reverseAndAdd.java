/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/45/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reverseAndAdd {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int counter = 0;
				boolean bool = false;
				for (counter = 0; bool == false; counter++) {
					long num = Long.parseLong(line);
					StringBuffer buff = new StringBuffer(line);
					String revString = buff.reverse().toString();
					long rev = Long.parseLong(revString);
					long sum = num + rev;
					String sumString = "" + sum;
					buff = new StringBuffer(sumString);
					String sumRevString = buff.reverse().toString();
					if (sumString.equals(sumRevString)) {
						bool = true;
					}
					line = sumString;
				}
				System.out.println(counter + " " + line);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}