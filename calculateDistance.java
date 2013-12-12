import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class calculateDistance {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
	        String points;
		
	        while ((points = infile.readLine()) != null) {
	        	points = points.replaceAll("[\\(\\),]", "");
			
	        	int space = points.indexOf(" ");
	        	String x = points.substring(0, space);
	        	points = points.substring(space + 1);
			
	        	space = points.indexOf(" ");
	        	String y = points.substring(0, space);
	        	points = points.substring(space + 1);
			
	        	space = points.indexOf(" ");
	        	String xx = points.substring(0, space);
	        	points = points.substring(space + 1);
			
	        	space = points.indexOf(" ");
				String yy = points.substring(0);
			
				int x1 = Integer.parseInt(x);
				int y1 = Integer.parseInt(y);
				int x2 = Integer.parseInt(xx);
				int y2 = Integer.parseInt(yy);
			
				int distance = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
				System.out.println(distance);
		}
		
		infile.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
