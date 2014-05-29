/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/98/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PointInCircle {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				line = line.replaceAll("Center: \\(", "");
				line = line.replaceAll("\\); Radius:", "");
				line = line.replaceAll("; Point: \\(", " ");
				line = line.replaceAll("\\)", "");
				line = line.replaceAll(",", "");
				String[] parts = line.split(" ");
				double centerX = Double.parseDouble(parts[0]);
				double centerY = Double.parseDouble(parts[1]);
				double radius = Double.parseDouble(parts[2]);
				double pointX = Double.parseDouble(parts[3]);
				double pointY = Double.parseDouble(parts[4]);
				double eq = Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2);
				radius = Math.pow(radius, 2);
				if (eq <= radius) System.out.println("true");
				else System.out.println("false");
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}