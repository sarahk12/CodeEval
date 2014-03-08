/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/116/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class morseCode {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			int space = 0;
							//10:A  11:B  12:C	  13:D	14:E  15:F	  16:G	  17:H	  18:I	19:J    20:K   21:L
			String[] morse = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", 
							".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", 
							"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
						  //22:M  23:N  24:O   25:P     26:Q    27:R  28:S   29:T  30:U   31:V   32:W   33:X    34:Y    35:Z
	
			while ((line = infile.readLine()) != null) {
				for (String str : line.split(" ")) {
					space++;
					for (int i = 0; i < morse.length; i++) {
						if (space == 2) {
							System.out.print(" ");
							space = 0;
						}
						if (str.compareTo(morse[i]) == 0 && i < 10) {
							System.out.print(i);
							space = 0;
						}	
						else if (str.compareTo(morse[i]) == 0){
							System.out.print(Character.toChars(i + 55));
							space = 0;
						}
					}
				}
				System.out.println();
				space = 0;
			}
			infile.close();
	
		} catch (FileNotFoundException e) {
			System.out.println("This is crap. Wrong stupid file name.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}