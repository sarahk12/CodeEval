/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/19/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class bitPositions {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] arr = line.split(",");
				int num = Integer.parseInt(arr[0]);
				int loc1 = Integer.parseInt(arr[1]);
				int loc2 = Integer.parseInt(arr[2]);
				int[] binaryArray = new int[400];
				int i = 0;
				
				for (i = 0; num > 2; i++) {
					binaryArray[i] = num % 2;
					num = num / 2;
				}
				if (num == 1)
					binaryArray[i++] = 1;
				else
					binaryArray[i++] = 0;
				int bit1 = binaryArray[loc1 - 1];
				int bit2 = binaryArray[loc2 - 1];
				
				if (bit1 == bit2)
					System.out.println("true");
				else
					System.out.println("false");
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}