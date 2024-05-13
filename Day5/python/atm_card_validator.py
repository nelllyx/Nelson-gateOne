user_input = input("Please enter your card details: ")

cardNumber = list(user_input)



def atm(cardDetails):

	if len(cardDetails) != 16 :

		value = 'InValid'

	elif cardDetails[0] != '4' or cardDetails[0] != '5' or cardDetails[0] != '6':

		value = 'Invalid'
	

	else: value = 'Valid'
	return value



print(atm(cardNumber))





	