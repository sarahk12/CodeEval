/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/99/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024
int main(int argc, char **argv)
{
    int x1, y1, x2, y2;
	FILE *ifp = fopen(argv[1], "r");
	while(fscanf(ifp, "(%d, %d) (%d, %d)\n", &x1, &y1, &x2, &y2) != EOF) {
		printf("%.0f\n", sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
	}
	return 0;
}
