/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/122/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hiddenDigits {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
	
			while ((line = infile.readLine()) != null) {
				int length = line.length();
				int counter = 0;
				for (int i = 0; i < length; i++) {
					if (line.charAt(i) == 'a') {
						System.out.print(0);
						counter++;
					}
					else if (line.charAt(i) == 'b') {
						System.out.print(1);
						counter++;
					}
					else if (line.charAt(i) == 'c') {
						System.out.print(2);
						counter++;
					}
					else if (line.charAt(i) == 'd') {
						System.out.print(3);
						counter++;
					}
					else if (line.charAt(i) == 'e') {
						System.out.print(4);
						counter++;
					}
					else if (line.charAt(i) == 'f') {
						System.out.print(5);
						counter++;
					}
					else if (line.charAt(i) == 'g') {
						System.out.print(6);
						counter++;
					}
					else if (line.charAt(i) == 'h') {
						System.out.print(7);
						counter++;
					}
					else if (line.charAt(i) == 'i') {
						System.out.print(8);
						counter++;
					}
					else if (line.charAt(i) == 'j') {
						System.out.print(9);
						counter++;
					}
					else if (line.charAt(i) == '0' || line.charAt(i) == '1' || line.charAt(i) == '2' || line.charAt(i) == '3' || 
							line.charAt(i) == '4' || line.charAt(i) == '5' || line.charAt(i) == '6' || line.charAt(i) == '7' || 
							line.charAt(i) == '8' || line.charAt(i) == '9') {
						System.out.print(line.charAt(i));
						counter++;
					}
					else if (counter == 0 && i == (length - 1))
						System.out.print("NONE");
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