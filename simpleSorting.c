#include <stdio.h>
#include <string.h>

#define LINE_SIZE 1024

struct node {
	int x;
	struct node *next;
};

int main(int argc, char **argv)
{
    FILE *f;
    char line[LINE_SIZE], *p;

    if (argc < 2 || !(f = fopen(argv[1], "r"))) {
        fprintf(stderr, "Unable to open file argument\n");
        return 1;
    }

	root = malloc(sizeof(struct node));
    while (fgets(line, LINE_SIZE, f)) {
        if ((p = strchr(line, '\n'))) { 
			*p = '\0'; 
		}
		
    }

	system("pause");
    return 0;
}
