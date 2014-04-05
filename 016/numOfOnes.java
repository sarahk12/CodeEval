/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/16/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class numOfOnes {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int num = Integer.parseInt(line);
				String binary = Integer.toBinaryString(num);
				int total = 0;
				for (int i = 0; i < binary.length(); i++) {
					char c = binary.charAt(i);
					String cc = Character.toString(c);
					num = Integer.parseInt(cc);
					if (num == 1) {
						total++;
					}
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