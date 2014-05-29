/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/112/
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SwapElements {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader infile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = infile.readLine()) != null) {
				String[] parts = line.split(" : ");
				String[] numStrings = parts[0].split(" ");
				int[] nums = new int[numStrings.length];
				for (int i = 0; i < numStrings.length; i++) {
					nums[i]= Integer.parseInt(numStrings[i]); 
				}
				String[] swapsStrings = parts[1].split(", ");
				for (int i = 0; i < swapsStrings.length; i++) {
					String[] swaps = swapsStrings[i].split("-");
					int a = Integer.parseInt(swaps[0]);
					int b = Integer.parseInt(swaps[1]);
					int firstSwap = Integer.parseInt(numStrings[a]);
					int secondSwap = Integer.parseInt(numStrings[b]);
					numStrings[b] = firstSwap + "";
					numStrings[a] = secondSwap + ""; 
				}
				for (int i = 0; i < numStrings.length; i++) {
					System.out.print(numStrings[i] + " ");
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