/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: 
*/

#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    char *newLine;
    char string[LINE_SIZE];
    while(fgets(string, LINE_SIZE, ifp) != NULL) {
    	if (newLine = strchr(string, '\n'))
			*newLine = '\0';
        printf();
    }
    return 0;
}
