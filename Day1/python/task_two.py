sum = 0;

number_of_scores = 10.0;

for number in range(10):

	scores = int(input('Enter score: '))

	sum+= scores

average = sum/number_of_scores

print('Sum of scores is ' + str(average))