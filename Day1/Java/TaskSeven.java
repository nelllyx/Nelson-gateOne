import java.util.Scanner;


public class TaskSeven{


	public static void main(String...args){



Scanner input = new Scanner(System.in);


int sum = 0;



for(int index = 1; index <= 10; index++){



System.out.println("Enter score " + index);


int scores = input.nextInt();

if(scores % 2 == 0){

sum +=scores;

}

}

double average = sum/noOfScores;


System.out.printf("%s%d%s%.2f","The sum of scores collected is ", sum," while the average is ", average);
}






}