import java.util.Scanner;

import java.util.ArrayList;


public class Test{

private static ArrayList<String> fnames = new ArrayList<String>();

private static ArrayList<String> lnames = new ArrayList<String>();

private static ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();


public static void main(String...args){

Scanner input = new Scanner(System.in);


mainMenu();



}



public static void mainMenu(){

Scanner input = new Scanner(System.in);

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

displayOptions(userInput);


}


public static void addContact(){


Scanner input = new Scanner(System.in);


System.out.print("Enter first name: ");

String firstName = input.next();

fnames.add(firstName);

System.out.print("Enter last name: ");

String lastName = input.next();

lnames.add(lastName);

System.out.print("Enter phone number: ");

int userNumber = input.nextInt();

phoneNumbers.add(userNumber);

System.out.println("Saving >>>>>>>>>>>>>>>");

System.out.println("Saved Successfully!!");

System.out.print("Do you want to save another contact? ");

String userResponse = input.next();


if(userResponse.equals("yes")){

addContact();

}else  if(userResponse.equals("no")){

System.out.println("Enter 0 to exit or 1 to go back to main menu ");

int userAnswer = input.nextInt();

if(userAnswer == 1){

mainMenu();

}else{

System.out.println("Thank You");

}

}


}

public static void removeContact(){

Scanner input = new Scanner(System.in);

System.out.print("Enter name of contact you wish to delete: ");

String deleteContact = input.nextLine();

for(int index = 0; index < fnames.size(); index++){

if(deleteContact.equals(index)){

String delete = "";

delete = fnames.get(index);

fnames.remove(delete);

lnames.remove(delete);

phoneNumbers.remove(delete);


}

}

System.out.println(fnames);

System.out.println(lnames);

System.out.println(phoneNumbers);



}

public static void displayOptions(int userInput){

switch(userInput){

case 1: addContact();

case 2: removeContact();





}







}


}