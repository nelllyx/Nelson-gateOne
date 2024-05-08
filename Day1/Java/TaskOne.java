import java.util.Scanner;


public class TaskOne{


	public static void main(String...args){



Scanner input = new Scanner(System.in);


int sum = 0;


for(int index = 1; index <= 10; index++){



System.out.println("Enter score " + index);


int scores = input.nextInt();

sum +=scores;



}

System.out.print(sum);

}






}