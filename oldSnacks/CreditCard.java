import java.util.Arrays;

import java.util.Scanner;


public class CreditCard{


public static void main(String [] args){

int total = 0;

int evenTotal = 0;

int length = 0;

String cardType = "";

String checkValidity = "";


System.out.print("Hello, Kindly enter your card details to verify: "); 

Scanner input = new Scanner(System.in);
 
String cardNumber = input.nextLine();

char [] charCard = cardNumber.toCharArray();

length = charCard.length;

if (length < 12 || length > 16){

	System.out.println("Oops, you have entered an invalid credit card number. Kindly check number and try again!")

	break;

}else if (cardNumber.startsWith("4")) { 

	cardType = "VISA-CARD";

} else if (cardNumber.startsWith("5")){

	cardType  = "MASTER CARD";

}else if(cardNumber.startsWith("37")){

	cardType = "American Express card";

}else if(cardNumber.startsWith("6")){

	cardType = "Discover card";

}else{

	cardType = "Invalid Card";

}


for(int index = charCard.length - 1; index >=0; index--){

if(index % 2 == 0 ){

int sum = 2 * Character.getNumericValue(charCard[index]);

evenTotal += (sum / 10) + (sum % 10);


}

}


for(int i = charCard.length -1; i >=0; i-=2){

total += Character.getNumericValue(charCard[i]);

}

int checker = evenTotal + total;

if(checker % 10 == 0){

checkValidity = "valid";

}else{

checkValidity = "Invalid";

}

System.out.println("***********************************************");

System.out.println("**Credit Card Type: " + cardType);


System.out.println("**Credit Card Number: " + cardNumber);

System.out.println("**Credit Card Digit Length: " + length);

System.out.println("**Credit Card Validity Status: " + checkValidity);

System.out.println("***********************************************");










}







}