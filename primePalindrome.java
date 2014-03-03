/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/3/
*/

public class primePalindrome {
	public static void main(String[] args) {
		primePalindrome prime = new primePalindrome();
		System.out.print(prime.prime1000());
	}
	
	public String prime1000() {
		for (int i = 999; i > 1; i--) {
			if (i % 2 == 0)
				continue;
			for (int j = 3; j < i/2; j+=2) {
				if (i % j == 0)
					break;
				else if (j == (i/2)-1) {
					String first = Integer.toString(i);
					String second = new StringBuilder(first).reverse().toString();
					int value = first.compareTo(second);
					if (value == 0) {
						return second;
					}
				}
			}
		}
		return "crap";
	}
}