/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/82/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class armstrongNumbers {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int length = line.length();
				int num = Integer.parseInt(line);
				System.out.println(armstrong(num, length));
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String armstrong(int num, int length) {
		int total = 0;
		int temp = num;
		for (int i = 0; i < length; i++) {
			total = (int)(total + Math.pow(num % 10,  length));
			num = num / 10;
		}
		if (temp == total)
			return "True";
		else
			return "False";
	}
}