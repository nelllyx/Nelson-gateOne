import java.util.Scanner;

import java.util.Arrays;

public class TaskThree{


public static void main(String...args){


Scanner input = new Scanner(System.in);

int [] scores = new int[10];

for(int index = 0; index < scores.length; index++){


System.out.println("Enter a score");

int score = input.nextInt();

scores[index] = score;

}

for(int counter: scores){

System.out.print(counter + " ");

}


}



}

