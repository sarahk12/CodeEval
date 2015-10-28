'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/62/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	test = test.rstrip('\n')
	parts = test.split(",")
	n = int(parts[0])
	m = int(parts[1])
	div = n / m
	remainder = n - (div * m)
	print(remainder)
test_cases.close()
