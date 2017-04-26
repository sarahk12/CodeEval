/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/156/
*/

#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv) {
	FILE *ifp = fopen(argv[1], "r");
	char c;
	int i;
	while(fscanf(ifp, "%c", &c) != EOF) {
		if (i == 0 || (i % 2 == 0 && (c >= 'a' && c <= 'z')))
			c = toupper(c);
		else if (c == '\n') {
			i = 0;
			printf("%c", c);
			continue;
		}
		else if (i % 2 != 0 && isalpha(c))
			c = tolower(c);
		else if (isspace(c) || !(isalpha(c))) {
			printf("%c", c);
			continue;
		}
		printf("%c", c);
		i++;
	}
	printf("\n");
	
	return 0;
}
