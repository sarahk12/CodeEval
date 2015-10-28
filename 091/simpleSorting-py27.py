'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/91/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	test = test.rstrip('\n')
	test = test.split(' ')
	parts = [float(n) for n in test]
	parts = sorted(parts)
	print parts
test_cases.close()
