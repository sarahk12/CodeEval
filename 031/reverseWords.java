/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/8/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class reverseWords {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
	        String line, word = null;
	        int space = -2;
		
	        while ((line = infile.readLine()) != null) {
	        	ArrayList<String> arrayList = new ArrayList<String>();
	        	while (space != -1) {
	        		space = line.indexOf(" ");
	        		if (space == -1)
	        			word = line.substring(0);
	        		else
	        			word = line.substring(0, space);
	        		arrayList.add(word);
	        		line = line.substring(space + 1);
	        	}
	        	String[] stringArray = new String[arrayList.size()];
	        	arrayList.toArray(stringArray);
	        	for (int i = arrayList.size() - 1; i > -1; i--) {
	        		System.out.print(stringArray[i] + " ");
	        	}
	        	word = null;
	        	arrayList.clear();
	        	space = -2;
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