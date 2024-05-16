import datetime

def main_menu():

	prompt = """

Welcome to your mensturation tracker app

Please select your preferred option

--------------------------------------

1 -> Track my menstral cycle

2 -> Check my period length

3 -> Know my safe period

4 -> Track ovulation

5 -> Safety Tips

"""

	user_response = int(input(prompt))

	display_options(user_response)




def menstral_cycle():


	cycle_length = int(input("How long is your cycle(in days): "))

	start_date = input("Enter the start date of your last period?( in dd-mm-YYYY date format ) ")

	date_object = datetime.datetime.strptime(start_date, "%d-%m-%Y")

	cycle = date_object + datetime.timedelta(days=cycle_length)

	formatted_date = cycle.strftime("%B %d,%Y")

	print("The start date of your next flow is " + formatted_date)




def period_length():

		


def display_options(user_response):

	match user_response:

		case 1: menstral_cycle()

		case 2: period_length()

		


main_menu()


