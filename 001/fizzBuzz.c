/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/1/
*/

#include <stdio.h>

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int f, b, end, i;
    while(fscanf(ifp, "%d %d %d\n", &f, &b, &end) != EOF) {
        for (i = 1; i <= end; i++) {
			if ((i % f == 0) && (i % b == 0))
				printf("FB ");
			else if (i % f == 0)
				printf("F ");
			else if (i % b == 0)
				printf("B ");
			else
				printf("%d ", i);
		}
		printf("\n");
    }
    return 0;
}
