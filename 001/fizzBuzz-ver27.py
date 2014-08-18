'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/1/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	test = test.rstrip('\n')
	nums = test.split(' ')
	F = int(nums[0])
	B = int(nums[1])
	end = int(nums[2])
	for i in range(1, 1 + end):
		if i % F == 0 and i % B == 0: sys.stdout.write("FB ")
		elif i % F == 0: sys.stdout.write("F ")
		elif i % B == 0: sys.stdout.write("B ")
		else: sys.stdout.write(str(i) + " ")
	print
test_cases.close()