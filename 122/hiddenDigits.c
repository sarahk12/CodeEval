/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/122/
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
	FILE *ifp = fopen(argv[1], "r");
    char str[LINE_SIZE];
    int if_first = 1; //true
    int if_none = 1; //false
    while(fgets(str, sizeof(str), ifp)) {
    	if (if_first == 0)
    		printf("\n");
    	else
    		if_first = 0;
    	int i = 0;
    	char ch = str[0];
    	for (i = 0; ch != '\0'; i++) {
    		ch = str[i];
    		int ascii = (int)ch;
    		if (ascii > 47 && ascii < 58) {
    			printf("%c", str[i]);
    			if_none = 0;
    		}
    		if (ascii > 96 && ascii < 107) {
    			ascii = ascii - 97;
    			printf("%d", ascii);
    			if_none = 0;
    		}
    	}
    	if (if_none == 1)
    		printf("NONE");
    	if_none = 1;
	}
	return 0;
}
