'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/8/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	test = test.rstrip('\n')
	words = test.split(' ')
	if len(words) > 0:
		sys.stdout.write(words[len(words) - 1])
		del words[-1]
		for word in words[::-1]:
			sys.stdout.write(" " + word)
	print("")
test_cases.close()