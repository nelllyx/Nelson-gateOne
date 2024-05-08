import java.util.Scanner;


public class TaskEight{


	public static void main(String...args){



Scanner input = new Scanner(System.in);


int sum = 0;


for(int index = 1; index <= 10; index++){



System.out.println("Enter score " + index);


int scores = input.nextInt();

if(scores < 0 || scores > 100){

System.out.println("Please enter a valid score! ");

index--;

}else{

sum +=scores;


}


}

System.out.print("The sum of valid scores is " + sum);


}



}