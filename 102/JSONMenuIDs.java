/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/102/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONMenuIDs {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int sum = 0;
				String quote = "\"";
				for (int i = 0; i < line.length(); i++) {
					int index = line.indexOf("Label ");
					if (index == -1) break;
					index = index + 6;
					int end = line.indexOf(quote, index);
					String num = line.substring(index, end);
					sum = sum + Integer.parseInt(num);
					line = line.substring(end + 1);
				}
				System.out.println(sum);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}