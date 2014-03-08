/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/46/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int i = 0, num = 0, counter = 0, j = 0;
    int numArray[LINE_SIZE];
    while(fscanf(ifp, "%d\n", &num) != EOF) {
		if (num > 4)
			printf("2,3", 2);
    	for (i = 4; i < num; i++) {
			if (i % 2 == 0)
				continue;
			for (j = 3; j <= i; j+=2) {
				if (i % j == 0 && i != j)
					break;
				if (j == i) {
					numArray[counter] = i;
					counter++;
				}	
			}
		}
		for (j = 0; j < counter; j++) {
			printf(",%d", numArray[j]);
		}
		printf("\n");
		counter = 0;
		for (j = 0; j <= i; j++)
			numArray[j] = '\0';
    }
    return 0;
}
