/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/###/
*/

#include <stdio.h>

int main(int argc, char **argv) {
	FILE *ifp = fopen(argv[1], "r");
	int i;
	while(fscanf(ifp, "%d \n", &i) != EOF) {
		printf("%d ", i);
	}
	printf("\n");
	
	return 0;
}
