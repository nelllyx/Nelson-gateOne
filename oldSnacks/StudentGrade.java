


import java.util.Arrays;

import java.util.Scanner;

public class StudentGrade{


public static void main(String...args){


System.out.print("How many students do you have: ");

Scanner input = new Scanner(System.in);

int studentNumber = input.nextInt();

System.out.print("How many subject do they offer : ");

int noOfSubjects = input.nextInt();


int [][] studentGrade = new int[studentNumber][noOfSubjects];

for (int index = 0; index < studentNumber; index++){

System.out.println("Entering score for student " + (index + 1 ));

	for (int jj = 0; jj < noOfSubjects; jj++){

	System.out.println("Enter score for subject " + (jj + 1 ));


int studentScore = input.nextInt();

if(studentScore < 0 || studentScore > 100){

System.out.println("Enter a score between 0 and 100 ");

jj--;

}else{

studentGrade[index][jj] = studentScore;

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println("Saved successfully");

}

}

}



display(studentGrade,noOfSubjects);
}

public static void display(int [][] multi,int subjects){

for(int index = 0;index < multi.length;index++){

	
	double average = 0;

	int total = 0;

	System.out.print("Student "+ (index + 1) + "\t");

	for(int counter = 0;counter < multi.length; counter++){

	total+= multi[index][counter];

	average = total/subjects;

	System.out.print(multi[index][counter] + "\t");	

} 

System.out.print(total + "\t");

System.out.print(average + "\t");

System.out.println();

}


}


}