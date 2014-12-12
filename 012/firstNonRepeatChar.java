/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/12/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;


public class firstNonRepeatChar {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				LinkedHashMap<Character, Integer> lettersMap = new LinkedHashMap<>(line.length());
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (!(lettersMap.containsKey(c))) lettersMap.put(c, 1);
					else lettersMap.put(c, lettersMap.get(c) + 1);
				}
				for (char ch : lettersMap.keySet()) {
					if (lettersMap.get(ch) == 1) {
						System.out.println(ch);
						break;
					}
				}
				lettersMap.clear();
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
