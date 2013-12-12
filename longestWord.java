import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class longestWord {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
	        BufferedReader infile = new BufferedReader(new FileReader(file));
			
//			Scanner scanner = new Scanner(System.in);
//			String file = scanner.next();
//			BufferedReader infile = new BufferedReader(new FileReader(file));
			
	        ArrayList<String> stringList = new ArrayList<String>();
	        String line, word = null;
	        int space = -2, length = 0, longLength = 0;
	        
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
	        	word = null;
	        	ListIterator<String> listItr = stringList.listIterator();
	        	while(listItr.hasNext()) {
	        		line = listItr.next();
	        		length = line.length();
	        		if (length > longLength) {
	        			word = line;
	        			longLength = length;
	        		}
	        	}
	        	System.out.println(word);
	        	stringList.clear();
	        	listItr = null;
	        	space = -2; length = 0; longLength = 0;
	        }
	        infile.close();
		}
		catch (IOException e) {
				System.out.println("This is crap. Wrong stupid file name.");
		} 
	}
}
