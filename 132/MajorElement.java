/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/132/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MajorElement {
//public class Main {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] s = line.split(",");
				int[] nums = new int[101];
				for (int i = 0; i < s.length; i++) {
					int num = Integer.parseInt(s[i]);
					nums[num]++;
				}
				int max = 0; int maxC = 0;
				boolean bool = false;
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] > (s.length / 2) && max < nums[i]) {
						max = i;
						maxC = nums[i];
						bool = true;
					}
				}
				if (bool == true) System.out.println(max);
				else System.out.println("None");
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}