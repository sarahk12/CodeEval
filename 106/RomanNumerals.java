/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/106/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RomanNumerals {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int num = Integer.parseInt(line) + 1;
				while (num - 1000 > 0) {
					num = num - 1000;
					System.out.print("M");
				}
				if (num - 900 > 0) {
					num = num - 900;
					System.out.print("CM");
				}
				while (num - 500 > 0) {
					num = num - 500;
					System.out.print("D");
				}
				if (num - 400 > 0) {
					num = num - 400;
					System.out.print("CD");
				}
				while (num - 100 > 0) {
					num = num - 100;
					System.out.print("C");
				}
				if (num - 90 > 0) {
					num = num - 90;
					System.out.print("XC");
				}
				while (num - 50 > 0) {
					num = num - 50;
					System.out.print("L");
				}
				if (num - 40 > 0) {
					num = num - 40;
					System.out.print("XL");
				}
				while (num - 10 > 0) {
					num = num - 10;
					System.out.print("X");
				}
				if (num - 9 > 0) {
					num = num - 9;
					System.out.print("IX");
				}
				while (num - 5 > 0) {
					num = num - 5;
					System.out.print("V");
				}
				if (num - 4 > 0) {
					num = num - 4;
					System.out.print("IV");
				}
				while (num - 1 > 0) {
					num = num - 1;
					System.out.print("I");
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