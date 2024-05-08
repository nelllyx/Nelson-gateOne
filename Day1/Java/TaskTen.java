import java.util.Scanner;


public class TaskTen{


	public static void main(String...args){



Scanner input = new Scanner(System.in);


int sum = 0;

int counter = 1;


for(int index = 1; index <= 10; index++){



System.out.println("Enter score " + index);


int scores = input.nextInt();

if(scores < 0 || scores > 100){

System.out.println("Please enter a valid score! ");

}else{

sum +=scores;

counter++;



}


}

System.out.print(counter);

double average = sum/counter;

System.out.printf("%s%d%s%.2f","The sum of scores collected is ", sum," while the average is ", average);



}



}