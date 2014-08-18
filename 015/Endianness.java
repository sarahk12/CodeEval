/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/15/
*/

import java.nio.ByteOrder;

public class Endianness {
	public static void main(String[] args) {
		if (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)) {
			System.out.println("BigEndian");
		} 
		else {
			System.out.println("LittleEndian");
		}
	}
}
