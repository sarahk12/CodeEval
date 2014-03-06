/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/18/
*/

#include <stdio.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int x, n, counter, total;
    while(fscanf(ifp, "%d,%d\n", &x, &n) != EOF) {
		total = 0;
        for (counter = 0; total < x; counter++)
        	total = n * counter;
        printf("%d\n", total);
    }
    return 0;
}
