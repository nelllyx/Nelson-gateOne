import java.util.ArrayList;

import java.util.Scanner;


	public class CheckOut{


public static void main(String ... args){

double userDiscount = 0;


double vat = 17.50;

double total = 0;

double subTotal = 0;

int i = 0;


String moreItems = "yes";

ArrayList<String> purchasedItem = new ArrayList<String>();


ArrayList<Integer> itemQty = new ArrayList<Integer>();

ArrayList<Double> itemPrice = new ArrayList<Double>();

ArrayList<Double> itemTotal = new ArrayList<Double>();


System.out.print("Enter your name ");

Scanner input = new Scanner(System.in);

String purchase = "";

int quantity = 0;

double itemAmount = 0.0;

	String customerName = input.nextLine();

	//String cashierName = input.nextLine();

while(moreItems.equals("yes")){

System.out.println("What did the user buy: ");

 purchase = input.next();

purchasedItem.add(purchase);


System.out.println("How many pieces? ");


 quantity =  input.nextInt();

itemQty.add(quantity);

System.out.println("How much per unit? ");

 itemAmount = input.nextDouble();

total = itemAmount * quantity;

itemPrice.add(itemAmount);

itemTotal.add(total);

System.out.println("Add more items? ");

 moreItems = input.next();

}


System.out.println("What is your name? ");

String cashierName = input.next();

System.out.println("How much discount will the customer get?");

double discount = input.nextDouble();





String eStore = """

SEMICOLON STORES

MAIN BRANCH

LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

TEL: 03293828343

DATE: 18-Dec-22 8:48:11 pm
""";








System.out.println(eStore);

System.out.println("Cashier name: " + cashierName);

System.out.println("Customer name: " + customerName);
System.out.print("==============================================================================");



System.out.print("\t\t" + "ITEM \t\t" + "QTY\t\t" + "PRICE\t\t" + "TOTAL(NGN)\t\t" + "\n");
System.out.println("------------------------------------------------------------------------------");


for(i = 0; i < purchasedItem.size(); i++){


System.out.printf("\t\t%s%12d%16.2f%16.2f%n",purchasedItem.get(i), itemQty.get(i)  , itemPrice.get(i) , itemTotal.get(i));

subTotal += itemTotal.get(i);

userDiscount = subTotal * (discount/100);


}


System.out.println("------------------------------------------------------------------------------");
	
double itemVat = subTotal * (vat/100);

System.out.printf("\t\t%15s%20.2f%n", "Sub Total: ", subTotal);

System.out.printf("\t\t%15s%20.2f%n", "Discount: ", userDiscount);

System.out.printf("\t\t%15s%20.2f%n", "VAT @ 17.50%: ", itemVat);


System.out.println("===============================================================================");

double billTotal = (subTotal + itemVat) - userDiscount;

System.out.printf("\t\t%15s%20.2f%n", "Bill Total: ", billTotal);



System.out.println("===============================================================================");


System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);


System.out.println("How much did the customer give to you?");


double customerPay = input.nextInt();

double balance = customerPay - billTotal;







System.out.println(eStore);

System.out.println("Cashier name: " + cashierName);

System.out.println("Customer name: " + customerName);
System.out.print("==============================================================================");



System.out.print("\t\t" + "ITEM \t\t" + "QTY\t\t" + "PRICE\t\t" + "TOTAL(NGN)\t\t" + "\n");
System.out.println("------------------------------------------------------------------------------");


for(i = 0; i < purchasedItem.size(); i++){


System.out.printf("\t\t%3s%16d%20.2f%20.2f%n",purchasedItem.get(i), itemQty.get(i)  , itemPrice.get(i) , itemTotal.get(i));

subTotal += itemTotal.get(i);

userDiscount = subTotal * (discount/100);


}


System.out.println("------------------------------------------------------------------------------");
	
//double itemVat = subTotal * (vat/100);

System.out.printf("\t\t%15s%20.2f%n", "Sub Total: ", subTotal);

System.out.printf("\t\t%15s%20.2f%n", "Discount: ", userDiscount);

System.out.printf("\t\t%15s%20.2f%n", "VAT @ 17.50%: ", itemVat);


System.out.println("===============================================================================");

//double billTotal = (subTotal + itemVat) - userDiscount;

System.out.printf("\t\t%15s%20.2f%n", "Bill Total: ", billTotal);

System.out.printf("\t\t%15s%20.2f%n", "Amount paid: ", customerPay);


System.out.printf("\t\t%15s%20.2f%n", "Balance: ", balance);

System.out.println("===============================================================================");

System.out.println("\t\t THANK YOU FOR YOUR PATRONAGE");


System.out.println("===============================================================================");


}





}