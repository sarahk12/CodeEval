/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/22/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fibonacciSeries {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				int n = Integer.parseInt(line);
				int sum = fibSeries(n);
				System.out.println(sum);
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int fibSeries(int n) {
		int sum = 0;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		n = n - 1;
		sum = sum + fibSeries(n) + fibSeries(n - 1);
		return sum;
	}
}