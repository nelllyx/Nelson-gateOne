import java.util.Scanner;


public class AtmCard{


public static void main(String...args){


Scanner input = new Scanner(System.in);

System.out.print("Please enter your card details: ");


String cardDetails = input.nextLine();


atmCardValidator(cardDetails);


}



public static Boolean atmCardValidator(String details){

char [] cardNumber = details.toCharArray();


int cardLength = 0;

cardLength = cardNumber.length;


for(int index = 0; index < cardNumber.length; index++){

if(cardLength < 16 || cardLength > 16){

System.out.println("Invalid card details");

break;

}else if(cardNumber[0] != '4' || cardNumber [0] != '5' || cardNumber[0] != '6' ){


System.out.println("Invalid card type");


}else if(cardNumber[index] == "-"){

continue;

index--;

}else{

System.out.println("valid card type");

}



}








}













}



}