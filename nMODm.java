import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class nMODm {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
		
//			Scanner scanner = new Scanner(System.in);
//			String file = scanner.next();
//			BufferedReader infile = new BufferedReader(new FileReader(file));

			String line;
			
			while ((line = infile.readLine()) != null) {
				int comma = line.indexOf(",");
				String tempN = line.substring(0, comma);
				line = line.substring(comma + 1);
				String tempM = line;
				
				int n = Integer.parseInt(tempN);
				int m = Integer.parseInt(tempM);
				if (n < m) {
					System.out.println(n);
				}
				else {
					int divNum = n/m;
					int remainder = n - (divNum * m);
					System.out.println(remainder);
				}
			}
			infile.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
