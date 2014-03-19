/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/3/
*/

#include <stdio.h>

int main() {
	int i, j, value, num, ii;
	char first[3], second[3];
    for (i = 999; i > 1; i--) {
		if (i % 2 == 0)
			continue;
		for (j = 3; j < i/2; j+=2) {
			if (i % j == 0)
				break;
			else if (j == (i/2) - 1) {
				ii = i;
				while (ii != 0) {
					num = num * 10;
					num = num + (ii % 10);
					ii = ii / 10;
				}
				
				if (num == i) {
					printf("%d", i);
					return 0;
				}
				num = 0;
			}
		}
	}
    return 0;
}
