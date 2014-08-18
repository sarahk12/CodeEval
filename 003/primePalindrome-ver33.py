'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/3/
'''

import sys

for i in range(999, 1, -2):
	for j in range(i - 1, 2, -1):
		if i % j == 0:
			break
		if j == 3:
			strI = str(i)
			revStrI = strI[::-1]
			if strI == revStrI:
				print(strI)
				sys.exit()