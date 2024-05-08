import java.util.Scanner;


public class TaskFive{


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

System.out.print("The sum of even number in the collected scores is " + sum);

}






}