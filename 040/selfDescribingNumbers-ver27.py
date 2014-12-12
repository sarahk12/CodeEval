'''
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/40/
'''

import sys

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	comList = []
	for i in range(0,10):
		comList.append(0)
	test = test.rstrip('\n')
	num1 = list(test)
	num1 = [int(n) for n in num1]
	for i in range(0, len(num1)):
		n = num1[i]
		comList[n] = comList[n] + 1
	comList = [str(n) for n in comList]
	word1 = ''.join(comList)
	word1 = word1[0:len(num1)]
	if (word1 == test): print(1)
	else: print(0)
test_cases.close()