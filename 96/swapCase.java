/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/96/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class swapCase {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
	        String line;
		
	        while ((line = infile.readLine()) != null) {
	        	int lineLength = line.length();
	        	for (int i = 0; i < lineLength; i++) {
	        		int asciiValue = line.charAt(i);
	        		if (asciiValue > 64 && asciiValue < 91) {
	        			asciiValue = asciiValue + 32;
	        		}
	        		else if (asciiValue > 96 && asciiValue < 123) {
	        			asciiValue = asciiValue - 32;
	        		}
	        		char c = (char)asciiValue;
	        		System.out.print(c);
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