import java.util.Scanner;


public class TaskTwo{


	public static void main(String...args){



Scanner input = new Scanner(System.in);

double noOfScores = 10.0; 

int sum = 0;



for(int index = 10; index <= 20; index++){



System.out.println("Enter score " + index);


int scores = input.nextInt();

sum +=scores;



}

double average = sum/noOfScores;


System.out.print("The average of scores is " + average);

}






}