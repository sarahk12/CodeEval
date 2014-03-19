/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/21/
*/

#include <stdio.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int num, total;
    while(fscanf(ifp, "%d\n", &num) != EOF) {
		total = 0;
		while (num > 0) {
			total = total + (num % 10);
			num = num / 10;
		}
		printf("%d\n", total);
    }
    return 0;
}
