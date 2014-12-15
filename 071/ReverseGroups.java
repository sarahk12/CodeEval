/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/71/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseGroups {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] parts = line.split(";");
				String[] numsString = parts[0].split(",");
				int[] nums = new int[numsString.length];
				for (int i = 0; i < numsString.length; i++) {
					nums[i] = Integer.parseInt(numsString[i]); 
				}
				int num = Integer.parseInt(parts[1]);
				for (int i = 0; i < nums.length; i = i + num) {
					// If there are less numbers left in the array than the number of elements to reverse.
					if ((i + num) > nums.length) {
						for (int j = i; j < nums.length; j++) {
							System.out.print("," + nums[j]);
						}
						
					}
					// If this this the first time the for loop has been executed.
					else if (i == 0) {
						System.out.print(nums[num - 1]);
						for (int j = num - 2; j >= 0; j--) {
							System.out.print("," + nums[i + j]);
						}
					}
					else {
						for (int j = num - 1; j >= 0; j--) {
							System.out.print("," + nums[i + j]);
						}
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