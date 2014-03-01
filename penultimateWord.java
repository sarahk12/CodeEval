import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;

public class penultimateWord {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
			
//			Scanner scanner = new Scanner(System.in);
//			String file = scanner.next();
//			BufferedReader infile = new BufferedReader(new FileReader(file));
	        
	        ArrayList<String> stringList = new ArrayList<String>();
	        String line, word = null;
	        int space = -2;
		
	        while ((line = infile.readLine()) != null) {
	        	while (space != -1) {
	        		space = line.indexOf(" ");
	        		if (space == -1)
	        			word = line.substring(0);
	        		else
	        			word = line.substring(0, space);
	        		stringList.add(word);
	        		line = line.substring(space + 1);
	        	}
	        	int size = stringList.size();
	        	word = stringList.get(size-2);
	        	System.out.println(word);
	        	stringList.clear();
	        	space = -2;
		}
		infile.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
