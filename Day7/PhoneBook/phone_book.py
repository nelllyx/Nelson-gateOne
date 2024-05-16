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


	else: print("No match found for number entered")

def find_by_fname():

	search_first_name = input("Enter contact first name: ")

	if search_first_name in first_name_list:

		print("Contact found")

	
	else: print("No match found for first name entered")


def find_by_lname():


	search_last_name = input("Enter contact last name: ")

	if search_last_name in last_name_list:

		print("Contact found")

	
	else: print("No match found for last name entered")


def edit_fname():

	search_first_name = input("Enter contact first name: ")

	if search_first_name in first_name_list:

		print("Contact found")

		change_name = input("Enter new first name: ")

		index = first_name_list.index(search_first_name)

		first_name_list[index] = change_name
		
		print("Saving >>>>>>>>>>>>>>>>>")

		print("Saved successfully")
	
	else: print("No match found for first name entered")

	response = input("Press 0 to go back to main menu or 1 to exit: ")

	if response == "0":

		main_menu()

	elif response == "1":
				
		print("Thank you")


def edit_lname():

	search_last_name = input("Enter contact last name: ")

	if search_last_name in last_name_list:

		print("Contact found")

		change_name = input("Enter new last name: ")

		index = last_name_list.index(search_last_name)

		last_name_list[index] = change_name
		
		print("Saving >>>>>>>>>>>>>>>>>")

		print("Saved successfully")
	
	else: print("No match found for first name entered")

	response = input("Press 0 to go back to main menu or 1 to exit: ")

	if response == "0":

		main_menu()

	elif response == "1":
				
		print("Thank you")


def edit_no():

	search_phone_no = int(input("Enter contact phone number: "))

	if search_phone_no in phone_number_list:

		print("Contact found")

		change_number = int(input("Enter new phone number: "))

		index = phone_number_list.index(search_phone_no)

		phone_number_list[index] = change_number
		
		print("Saving >>>>>>>>>>>>>>>>>")

		print("Saved successfully")
	
	else: print("No match found for number entered")

	response = input("Press 0 to go back to main menu or 1 to exit: ")

	if response == "0":

		main_menu()

	elif response == "1":
				
		print("Thank you")




def edit_contact():

	prompt = """


Please select what you would like to edit

--------------------------------------

1 -> First name

2 -> Last name

3 -> Phone number

4 -> Edit all

 	
"""

	user_reply = int(input(prompt))

	match user_reply:

		case 1: edit_fname()

		case 2: edit_lname()

		case 3: edit_no()


def display_options(user_response):

	match user_response:

		case 1: add_contact()

		case 2: remove_contact()

		case 3: find_by_number()

		case 4: find_by_fname()

		case 5: find_by_lname()

		case 6: edit_contact()
	



main_menu()










		
