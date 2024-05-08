import java.util.Scanner;


public class TaskThree{


	public static void main(String...args){



Scanner input = new Scanner(System.in);

double noOfScores = 10.0;

int sum = 0;



for(int index = 1; index <= 10; index++){



System.out.println("Enter score " + index);


int scores = input.nextInt();

sum +=scores;



}

double average = sum/noOfScores;


System.out.printf("%s%d%s%.2f","The sum of scores collected is ", sum," while the average is ", average);

}






}