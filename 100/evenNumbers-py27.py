'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/100/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	test = test.rstrip('\n')
	num = int(test)
	mod = num % 2
	if mod == 1: print 0
	else: print 1
test_cases.close()
