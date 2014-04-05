/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/115/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class mixedContent {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] clumps = line.split(",");
				ArrayList<Integer> nums = new ArrayList<Integer>();
				ArrayList<String> words = new ArrayList<String>();
				for (int i = 0; i < clumps.length; i++) {
					boolean ifNum = isNum(clumps[i]);
					if (ifNum == true)
						nums.add(Integer.parseInt(clumps[i]));
					else
						words.add(clumps[i]);
				}
				int i = 0;
				for (i = 0; i < words.size() - 1; i++)
					System.out.print(words.get(i) + ",");
				if (words.size() > 0)
					System.out.print(words.get(i));
				if (nums.size() > 0 && words.size() > 0)
					System.out.print("|");
				for (i = 0; i < nums.size() - 1; i++)
					System.out.print(nums.get(i) + ",");
				if (nums.size() > 0)
					System.out.print(nums.get(i));
				System.out.println();
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static boolean isNum (String str) {
		try {
			int num = Integer.parseInt(str);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}