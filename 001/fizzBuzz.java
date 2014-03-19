/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/1/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fizzBuzz {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
	        String line;
		
	        while ((line = infile.readLine()) != null) {
	        	int space = line.indexOf(" ");
	        	String f = line.substring(0, space);
	        	line = line.substring(space + 1);
			
	        	space = line.indexOf(" ");
	        	String b = line.substring(0, space);
	        	line = line.substring(space + 1);
			
	        	String last = line;
			
				int fizz = Integer.parseInt(f);
				int buzz = Integer.parseInt(b);
				int end = Integer.parseInt(last);
				
				for (int start = 1; start <= end; start++) {
					if (start % fizz == 0 && start % buzz == 0) {
						System.out.print("FB ");
					}
					else if (start % fizz == 0) {
						System.out.print("F ");
					}
					else if (start % buzz == 0) {
						System.out.print("B ");
					}
					else {
						System.out.print(start + " ");
					}
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
