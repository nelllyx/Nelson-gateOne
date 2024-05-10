import random

print("===========================================")

print("Welcome to Today's Arithmetic Quiz")
print("You have 30 minutes for this Test, GOODLUCK!!!")

print("===========================================")


def quiz():

	count = 0

	counter = 0

	first_number = random.randint(1,100)

	second_number = random.randint(1,100)

	operator = random.randint(1,5)

	if operator == 1:

		userInput = int(input(f"What is {first_number} + {second_number}: "))

		answer = first_number + second_number

		if answer == userInput:

			print(" Correct ")

			count = count + 1

		else:

			print("Incorrect")

			counter = counter + 1


	elif operator == 2:

		userInput = int(input(f"What is {first_number} - {second_number}: "))

		answer = first_number + second_number;

		if answer == userInput:

			print(" Correct ")

			count = count + 1

		else:

			print("Incorrect")

			counter = counter + 1


	elif operator == 3:

		userInput = int(input(f"What is {first_number} * {second_number}: "))

		answer = first_number * second_number;

		if answer == userInput:

			print(" Correct ")

			count = count + 1

		else:
			print("Incorrect")

			counter = counter + 1

	elif operator == 4:

		userInput = int(input(f"What is {first_number} / {second_number}: "))

		answer = first_number / second_number;

		if answer == userInput:

			print(" Correct ")

			count = count + 1

		else:
			print("Incorrect")
			
			counter = counter + 1

	elif operator == 5:

		userInput = int(input(f"What is {first_number} % {second_number}: "))

		answer = first_number % second_number;

		if answer == userInput:

			print(" Correct ")

			count = count + 1

		else:
			print("Incorrect")
			
			counter = counter + 1


for index in range(10):

	quiz()


print(f"You got {count} correct questions and and failed      {counter} questions ")

if count > 5:

	print('Congratulations, You passed the test!!')

elif counter < 5:

	print('You failed the test. Better luck next time')







	

	




