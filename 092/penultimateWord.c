/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/92/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024
int main(int argc, char **argv) {
	FILE *ifp = fopen(argv[1], "r");
	char c = 'a';
	char *newLine;
	char string[LINE_SIZE];
	int i, start, end = 0;
	while(fgets(string, LINE_SIZE, ifp) != NULL) {
		if (newLine = strchr(string, '\n'))
			*newLine = '\0';
		for (i = 0; c != '\0'; i++) {
			c = string[i];
			if (c == ' ') {
				start = end;
				end = i;
			}
		}
		if (start > 0)
			start = start + 1;
		//printf("end: %d\tstart:%d\n", end, start);
		for (i = start; i < end; i++) {
			printf("%c", string[i]);
		}
		for (i = 0; i < LINE_SIZE; i++) {
			string[i] = '\0';
		}
		c = 'a';
		end = 0;
		printf("\n");
    }
    system("pause");
    return 0;
}
