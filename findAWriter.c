/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/97/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    char *newLine;
    char string[LINE_SIZE];
    while(fgets(string, LINE_SIZE, ifp) != NULL) {
		int nums[LINE_SIZE], num;
    	if (newLine = strchr(string, '\n'))
			*newLine = '\0';
		// Skip empty lines
        if (string[0] == '\0') { continue; }
		int i, j;
        char *str;
        str = strtok(string, "|");
        for (i = 0; str != NULL; i++) {
			str = strtok(NULL, " ");
			num = atoi(str);
			if (num == 0) break;
			nums[i] = num;
		}
		for (j = 0; j < i; j++) {
			num = nums[j];
			printf("%c", string[num-1]);
		}
		printf("\n");
    }
    system("pause");
    return 0;
}
