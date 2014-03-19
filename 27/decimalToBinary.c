/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/27/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int decNum = 0;
    while(fscanf(ifp, "%d\n", &decNum) != EOF) {
		int i = 0, j = 0;
		int binary[LINE_SIZE];
		if (decNum == 1 || decNum == 0) {
			printf("%d\n", decNum);
			continue;
		}
        for (i = 0; decNum > 0; i++) {
			binary[i] = decNum % 2;
			decNum = decNum / 2;
		}
		for (j = (i-1); j > -1; j--) {
			printf("%d", binary[j]);
		}
		printf("\n");
		for (j = 0; j < i; j++) {
			binary[j] = '\0';
		}
    }
    system("pause");
    return 0;
}
