'''
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/4/
'''

total = 5
counter = 3
i = 4
while (counter < 1001):
    if ((i % 2) == 0): 
        i+=1
        continue
    j = 3
    while j <= i:
        if ((i % j == 0) and (i != j)): 
            break
        if (j == i):
            total+=i
            counter+=1
        j+=2
    i+=1

print (total)