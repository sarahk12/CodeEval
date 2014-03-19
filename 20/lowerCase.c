/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/20/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int i;
    char *newLine;
    char string[LINE_SIZE];
    while(fgets(string, LINE_SIZE, ifp) != NULL) {
    	if (newLine = strchr(string, '\n'))
			*newLine = '\0';
		for (i = 0; string[i] != '\0'; i++)
        	printf("%c", tolower(string[i]));
        for (i = 0; i < LINE_SIZE; i++)
        	string[i] = '\0';
        printf("\n");
    }
    system("pause");
    return 0;
}
