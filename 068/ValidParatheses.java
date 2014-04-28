/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/68/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ValidParatheses {
//public class Main {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int frontP = 0, backP = 0, frontB = 0, backB = 0, frontW = 0, backW = 0;
				boolean bool = true;
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (c == '(') frontP++;
					if (c == ')') backP++;
					if (c == '[') frontB++;
					if (c == ']') backB++;
					if (c == '{') frontW++;
					if (c == '}') backW++;
					if (c == ')' && i > 0 && (line.charAt(i - 1) == '{' || line.charAt(i - 1) == '[')) bool = false;
					if (c == '}' && i > 0 && (line.charAt(i - 1) == '(' || line.charAt(i - 1) == '[')) bool = false;
					if (c == ']' && i > 0 && (line.charAt(i - 1) == '{' || line.charAt(i - 1) == '(')) bool = false;
				}
				if (frontP == backP && frontB == backB && frontW == backW && bool == true) System.out.println("True " + line);
				else System.out.println("False " + line);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}