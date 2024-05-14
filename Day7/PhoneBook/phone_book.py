first_name_list = []

last_name_list = []

phone_number_list = []

def main_menu():

	prompt = """

Welcome to your phone book page

Please select your preferred option

--------------------------------------

1 -> Add contact

2 -> Remove contact

3 -> Find contact by phone number

4 -> Find contact by First name 

5 -> Find contact by Last name

6 -> Edit contact

"""

	user_response = int(input(prompt))

	display_options(user_response)

def add_contact():

	print("Create a new contact")

	first_name = input("Enter first name: ")

	first_name_list.append(first_name)

	last_name = input("Enter last name: ")

	last_name_list.append(last_name)

	phone_number = int(input("Enter user phone number: "))

	phone_number_list.append(phone_number)

	print("Saving >>>>>>>>>>>>>>>>>")

	print("Saved successfully")

	user_answer = input("Do you want to save another contact: ")

	if user_answer == "yes":

		add_contact()
		
	elif user_answer == "no":
	
		response = input("Press 0 to go back to main menu or 1 to exit: ")

		if response == "0":

			main_menu()

		elif response == "1":
				
			print("Thank you")
	
def remove_contact():

	delete_first_name = input("Enter contact name you wish to delete: ")

	for i in range(len(first_name_list)-1):

			if delete_first_name == first_name_list[i]:

				first_name_list.pop(i)

				last_name_list.pop(i)

				phone_number_list.pop(i)

				print("Deleting >>>>>>>>>>>>>>>>>")

				print("Deleted successfully")

				print(first_name_list)

			
def find_by_number():

	user_number = int(input("Enter the number you wish to find: "))

	if user_number in phone_number_list:

		print("contact found " + str(user_number))


	else: print("No match for number entered")

def find_by_fname():

	search_first_name = input("Enter contact first name: ")



def display_options(user_response):

	match user_response:

		case 1: add_contact()

		case 2: remove_contact()

		case 3: find_by_number()

	



main_menu()










		
