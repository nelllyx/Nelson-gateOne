import java.util.Scanner;


public class TaskTwo{


	public static void main(String...args){


Scanner input = new Scanner(System.in);


String [][] array = new String [3][3];

String [] userInput = new String [9];

for(int index = 0; index < 9; index++){

System.out.print("Enter between X or O: ");

String user = input.next();

userInput[index] = user;

System.out.print("What column do you want to place " + user + ": ");

int position = input.nextInt();

}

for(int index = 0; index < 3;index++){

	
	

	for(int column = 0; column < 3; column++){

	array[index] = userInput;

	System.out.print(array[index][column] + " ");

	System.out.println();

	
}


}

}



}