'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/18/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	test = test.rstrip('\n')
	nums = test.split(',')
	x = int(nums[0])
	n = int(nums[1])
	total = 0
	counter = 0
	while total < x:
		total = n * counter
		counter = counter + 1
	print(total)
test_cases.close()