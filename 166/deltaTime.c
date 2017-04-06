/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/166/
*/

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
	FILE *ifp = fopen(argv[1], "r");
	int h1, m1, s1, h2, m2, s2, h, m, s;
	while(fscanf(ifp, "%d:%d:%d %d:%d:%d\n", &h1, &m1, &s1, &h2, &m2, &s2) != EOF) {
		if(h1 == h2) {
			if(m1 == m2) {
				h = h2 - h1;
				m = m2 - m1;
				s = s2 - s1;
			}
			else if(m2 > m1) {
				h = h2 - h1;
				m = m2 - m1;
				s = s2 - s1;
			}
			else if(m1 > m2) {
				h = h1 - h2;
				m = m1 - m2;
				s = s1 - s2;
			}
		}
		else if(h2 > h1) {
			h = h2 - h1;
			m = m2 - m1;
			s = s2 - s1;
		}
		else if(h1 > h2) {
			h = h1 - h2;
			m = m1 - m2;
			s = s1 - s2;
		}
		
		if(s < 0) {
			m = m - 1;
			s = abs(60 + s);
		}
		if(m < 0) {
			h = h - 1;
			m = abs(60 + m);
		}
		printf("%02d:%02d:%02d\n", h, m, s);
	}
	return 0;
}