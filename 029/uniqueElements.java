/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/29/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class uniqueElements {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] arr = line.split(",");
				ArrayList<Integer> nums = new ArrayList<Integer>();
				int i = 0;
				for (i = 1; i < arr.length; i++) {
					if (i == (arr.length - 1) && (arr[i].compareTo(arr[i - 1]) == 0)) {
						nums.add(Integer.parseInt(arr[i]));
					}
					else if (i == (arr.length - 1) && !(arr[i].compareTo(arr[i - 1]) == 0)) {
						nums.add(Integer.parseInt(arr[i - 1]));
						nums.add(Integer.parseInt(arr[i]));
					}
					else if (arr[i].compareTo(arr[i - 1]) == 0) {
						continue;
					}
					else {
						nums.add(Integer.parseInt(arr[i - 1]));
					}
				}
				System.out.print(nums.get(0));
				for (i = 1; i < nums.size(); i++) {
					System.out.print("," + nums.get(i));
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