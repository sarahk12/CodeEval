/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/39/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class happyNumbers {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int num = Integer.parseInt(line);
				num = happyNums(num);
				System.out.println(num);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int happyNums(int num) {
		for (int i = 0; i < 100; i++) {
			int total = 0;
			while (num > 0) {
				total = (int)(Math.pow(num % 10,  2) + total);
				num = num / 10;
			}
			if (total == 1)
				return 1;
			num = total;
		}
		return 0;
	}
}