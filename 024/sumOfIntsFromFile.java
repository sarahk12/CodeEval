/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/_/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sumOfIntsFromFile {
public static void main(String[] args) {
	try {
		File file = new File(args[0]);
		BufferedReader infile = new BufferedReader(new FileReader(file));
		String line;
		int total = 0;
		while ((line = infile.readLine()) != null) {
			int num = Integer.parseInt(line);
			total = total + num;
		}
		System.out.println(total);
		infile.close();
	} catch (FileNotFoundException e) {
		System.out.println("This is crap. Wrong stupid file name.");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}