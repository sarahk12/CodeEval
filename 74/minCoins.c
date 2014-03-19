/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/74/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int num = 0;
    while(fscanf(ifp, "%d\n", &num) != EOF) {
        int coins = 0;
        while (num > 4) {
        	coins++;
        	if (num > 4)
        		num = num - 5;
		}
        while (num > 2) {
        	coins++;
        	if (num > 2)
        		num = num - 3;
		}
        if (num > 0) {
        	coins = coins + num;
		}
		printf("%d\n", coins);
    }
    system("pause");
    return 0;
}
