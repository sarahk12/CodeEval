/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/111/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024
int main(int argc, char **argv)
{
    FILE *ifp = fopen(argv[1], "r");
    int length = 0, longLen = 0, i;
    char *newLine, c = 'a';
    char string[LINE_SIZE], longest[LINE_SIZE], temp[LINE_SIZE];
    while(fgets(string, LINE_SIZE, ifp) != NULL) {
    	if (newLine = strchr(string, '\n'))
			*newLine = '\0';
		for (i = 0; c != '\0'; i++) {
			c = string[i];
			temp[length] = c;
			if (c == ' ' || c == '\0') {
				if (longLen < length) {
					strcpy(longest, temp);
					longLen = length;
				}
				length = 0;
			}
			else
				length++;
		}
		for (i = 0; i < longLen; i++) {
			printf("%c", longest[i]);
		}
        printf("\n");
        for (i = 0; i < LINE_SIZE; i++) {
			string[i] = '\0';
			temp[i] = '\0';
			longest[i] = '\0';
		}
		length = 0; longLen = 0; c = 'a';
    }
    system("pause");
    return 0;
}
