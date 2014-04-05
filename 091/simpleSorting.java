/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/91/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class simpleSorting {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] arr = line.split(" ");
				double[] nums = new double[arr.length];
				for (int i = 0; i < arr.length; i++) {
					nums[i] = Double.parseDouble(arr[i]);
				}
				Arrays.sort(nums);
				for (double aNum : nums)
					System.out.printf("%.3f ", aNum);
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