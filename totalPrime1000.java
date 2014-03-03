/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/4/
*/

public class totalPrime1000 {
	public static void main(String[] args) {
		totalPrime1000 primeTotal = new totalPrime1000();
		System.out.print(primeTotal.totalingPrime());
	}
	int totalingPrime() {
		int total = 5;
		int counter = 3;
		for (int i = 4; counter < 1001; i++) {
			if (i % 2 == 0)
				continue;
			for (int j = 3; j <= i; j+=2) {
				if (i % j == 0 && i != j)
					break;
				if (j == i) {
					total = total + i;
					counter++;
				}
			}
		}
		return total;
	}
}