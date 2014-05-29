/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/136/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RacingChars {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			int loc = -1;
			while ((line = infile.readLine()) != null) {
				int locC = line.indexOf('C');
				int loc_ = line.indexOf('_');
				if (locC > -1 && loc == -1) line = line.replace('C', '|');
				else if (locC > -1 && loc < locC) line = line.replace('C', '\\');
				else if (locC > -1 && loc > locC) line = line.replace('C', '/');
				else if (locC > -1 && loc == locC) line = line.replace('C', '|');
				else if (loc == -1) line = line.replace('_', '|');
				else if (loc > loc_) line = line.replace('_', '/');
				else if (loc < loc_) line = line.replace('_', '\\');
				else line = line.replace('_', '|');
				if (locC > -1) loc = locC;
				else loc = loc_;
				System.out.println(line);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}