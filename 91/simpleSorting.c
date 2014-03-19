/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/91/
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h> 

#define LINE_SIZE 1024

int main(int argc, char **argv) {
    FILE *ifp = fopen(argv[1], "r");
    char *newLine;
    char string[LINE_SIZE];
    while (fgets(string, LINE_SIZE, ifp) != NULL) {
    	if (newLine = strchr(string, '\n'))
			*newLine = '\0';
		double nums[LINE_SIZE];
		char *stringNum;
		double num = 0, temp;
		int counter = 0, counter2 = 0;
		stringNum = strtok(string, " ");
    	while (stringNum != NULL) {
			num = atof(stringNum);
        	nums[counter] = num;
        	stringNum = strtok(NULL, " ");
        	counter++;
    	}
    	int i = 0, j = 0;
    	for (i = 0; i < counter; i++) {
    		for (j = 0; j < counter-1; j++) {
				if (nums[j] > nums[j+1]) {
					temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
    	for (i = 0; i < counter; i++) {
			printf("%.3f ", nums[i]);
		}
		for (i = 0; i <= counter; i++) {
			nums[i] = '\0';
		}
    	printf("\n");
    }
    system("pause");
    return 0;
}
