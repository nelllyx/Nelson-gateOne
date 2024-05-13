import java.util.Scanner;

import java.util.ArrayList;


public class PhoneBook{

	public static void main(String...args){

Scanner input = new Scanner(System.in);

ArrayList<String> names = new ArrayList<String>();

ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();

String prompt = """

Welcome to your phone book page

Please select your preferred option

--------------------------------------

1 -> Add contact

2 -> Remove contact

3 -> Find contact by phone number

4 -> Find contact by First name 

5 -> Find contact by Last name

6 -> Edit contact

""";

System.out.println(prompt);

int userInput = input.nextInt();

switch (userInput){

case 1:

System.out.println("Create a new contact");

System.out.print("Enter first name: ");

String firstName = input.next();

names.add(firstName);

System.out.print("Enter last name: ");

String lastName = input.next();

names.add(lastName);

System.out.print("Enter phone number: ");

int userNumber = input.nextInt();

phoneNumbers.add(userNumber);


System.out.println("Saving >>>>>>>>>>>>>>>");

System.out.println("Saved Successfully!!");

System.out.print("Do you want to save another contact? ");

String userResponse = input.next();

int count = 0;

while(userResponse.equals( "yes")){

add();

}
count++;

break;

case 2:

System.out.print("Enter the name of contact to delete: ");

String name = input.next();

System.out.println("Deleting >>>>>>>>>>>>>>>");

System.out.println("Deleted Successfully!!");








}



System.out.println(names);

System.out.println(phoneNumbers);














}




}