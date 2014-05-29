/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/139/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WorkingExperience {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
			while ((line = infile.readLine()) != null) {
				boolean[] work = new boolean[360];
				line = line.replaceAll(";", "");
				line = line.replaceAll("-", " ");
				String[] splits = line.split(" ");
				for (int i = 0; i < splits.length; i+=4) {
					int begin = 0;
					int end = 0;
					for (int j = 0; j < months.length; j++) {
						if (splits[i].equals(months[j])) {
							begin = j;
							break;
						}
					}
					int year = ((Integer.parseInt(splits[i + 1])) - 1990) * 12;
					begin = year + begin;
					for (int j = 0; j < months.length; j++) {
						if (splits[i + 2].equals(months[j])) {
							end = j;
							break;
						}
					}
					year = ((Integer.parseInt(splits[i + 3])) - 1990) * 12;
					end = end + year;
					for (int j = begin; j <= end; j++) {
						work[j] = true; 
					}
					System.out.println(i + ": " + "begin: " + begin);
					System.out.println(i + ": " + "end: " + end);
				}
				int counter = 0;
				for (int j = 0; j < work.length; j++) {
					if (work[j] == true) counter++;
				}
				int w = counter/12;
				System.out.println(w);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}