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

match user_response:

	case first:

		print("Create a new contact")

		option = True

		
