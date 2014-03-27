/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/30/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class setIntersection {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] arr = line.split(";");
				String[] list1 = arr[0].split(",");
				String[] list2 = arr[1].split(",");
				boolean comma = false;
				int i = 0, j = 0;
				for (i = 0; i < list1.length; i++) {
					for (j = 0; j < list2.length; j++) {
						if (list1[i].compareTo(list2[j]) == 0 && comma == false) {
							System.out.print(list2[j]);
							comma = true;
						}
						else if (list1[i].compareTo(list2[j]) == 0 && comma == true)
							System.out.print("," + list2[j]);
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