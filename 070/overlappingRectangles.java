/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/70/
*/

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class overlappingRectangles {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] points = line.split(",");
				int x1_1 = Integer.parseInt(points[0]);
				int y1_1 = Integer.parseInt(points[1]);
				int x2_1 = Integer.parseInt(points[2]);
				int y2_1 = Integer.parseInt(points[3]);
				int x1_2 = Integer.parseInt(points[4]);
				int y1_2 = Integer.parseInt(points[5]);
				int x2_2 = Integer.parseInt(points[6]);
				int y2_2 = Integer.parseInt(points[7]);
				int width = 0;
				int height = 0;
				width = Math.abs(x1_1 - x2_1);
				height = Math.abs(y1_1 - y2_1);
				Rectangle r1 = new Rectangle(x1_1, y1_1, width, height);

				width = Math.abs(x1_2 - x2_2);
				height = Math.abs(y1_2 - y2_2);
				Rectangle r2 = new Rectangle(x1_2, y1_2, width, height);
				if (r1.intersects(r2)) System.out.println("True");
				else System.out.println("False");
			}	
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}