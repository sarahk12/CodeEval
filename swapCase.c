/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/96/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    int i, asciiValue;
    char *newLine, c = 'a';
    char string[LINE_SIZE];
    while(fgets(string, LINE_SIZE, ifp) != NULL) {
//    	if (newLine = strchr(string, '\n'))
//			*newLine = '\0';
        for (i = 0; c != '\0' || c != '\n' || c != '\r'; i++) {
			c = string[i];
			if (c >= 'a' && c <= 'z') {
				c = ('A' + c - 'a');
			}
			else if (c >= 'A' && c<= 'Z') {
				c = c + 32;
			}
			printf("%c", c);
//			c = string[i];
//			asciiValue = (int)c;
//			if (asciiValue > 64 && asciiValue < 91) {
//	        	asciiValue = asciiValue + 32;
//	        }
//	        else if (asciiValue > 96 && asciiValue < 123) {
//	        	asciiValue = asciiValue - 32;
//	        }
//	        c = (char)asciiValue;
//	        printf("%c", c);
	        
	        
//			if (islower(c) == 0)
//				printf("%c", tolower(c));
//			else if (isupper(c) == 0)
//				printf("%c", toupper(c));
//			else
//				printf("%c", c);
		}
		printf("\n");
		for (i = 0; i < LINE_SIZE; i++) {
			string[i] = '\0';
		}
		c = 'a';
    }
    system("pause");
    return 0;
}
