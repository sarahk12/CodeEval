/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/66/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PascalTriangle {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int num = Integer.parseInt(line);
				int[][] pascal = new int[num * 2][num * 2];
				pascal[0][num - 1] = 1;
				for (int row = 1; row < num; row++) {
					for (int col = 0; col < (num * 2); col++) {
						if (col < 1) pascal[row][0] = pascal[row - 1][col + 1];
						else if (col > ((num * 2) - 2)) pascal[row][((num * 2) - 1)] = pascal[row - 1][((num * 2) - 1)];
						else pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col + 1]; 
					}
				}
				for (int row = 0; row < num; row++) {
					for (int col = 0; col < (num * 2); col++) {
						if (pascal[row][col] != 0) System.out.print(pascal[row][col] + " ");
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