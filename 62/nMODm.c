/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/62/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024
int main(int argc, char **argv)
{
    int n, m, divNum, remainder = 0;
	FILE *ifp = fopen(argv[1], "r");
    while(fscanf(ifp, "%d,%d\n", &n, &m) != EOF) {
        divNum = n/m;
        remainder = n - (divNum * m);
		printf("%d\n", remainder);
    }
    return 0;
}
