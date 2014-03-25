/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/40/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class selfDescribeNum {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
	
			while ((line = infile.readLine()) != null) {
				int[] listNum = new int[10];
				int length = line.length();
				int num = 0;
				for (int i = 0; i < length; i++) {
					num = (int)(line.charAt(i) - '0');
					listNum[num]++;
				}
				String anotherLine = "";
				for (int j = 0; j < line.length(); j++) {
					String str = Integer.toString(listNum[j]);
					anotherLine = anotherLine.concat(str);
				}
				if (line.compareTo(anotherLine) == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}
	
			infile.close();
	
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}