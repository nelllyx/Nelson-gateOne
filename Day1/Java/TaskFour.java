import java.util.Scanner;


public class TaskFour{


	public static void main(String...args){



Scanner input = new Scanner(System.in);


int sum = 0;


for(int index = 1; index <= 10; index+=2){



System.out.println("Enter score " + index);


int scores = input.nextInt();


sum += index;


}

System.out.print(sum);

}






}