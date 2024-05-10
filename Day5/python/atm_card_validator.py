user_input = input("Please enter your card details: ")

cardNumber = list(user_input)



def atm(cardDetails):

	if len(cardDetails) == 16:

		return 'Valid'

	elif cardNumber[0] == '4' or cardNumber[0] == '5' or cardNumber[0] == '6':

		return 'Valid'
	

	else: return 'Invalid'




atm(cardNumber)



	