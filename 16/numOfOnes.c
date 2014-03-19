/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/16/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int decNum = 0;
    while(fscanf(ifp, "%d\n", &decNum) != EOF) {
		int i = 0, j = 0, counter1 = 0, n = 0;
		if (decNum == 1) {
			printf("%d\n", 1);
			continue;
		}
		if (decNum == 0) {
			printf("%d\n", 0);
			continue;
		}
        for (i = 0; decNum > 0; i++) {
			n = decNum % 2;
			if (n == 1)
				counter1++;
			decNum = decNum / 2;
		}
		printf("%d\n", counter1);
    }
    system("pause");
    return 0;
}
