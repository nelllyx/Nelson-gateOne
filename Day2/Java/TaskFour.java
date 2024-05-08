import java.util.Scanner;

import java.util.Arrays;

public class TaskFour{


public static void main(String...args){



int [] numbers = {21,2,18,17,32,65,10,13,15,8};



System.out.print(Arrays.toString(evenArray(numbers)));



}

public static int [] evenArray(int [] arr){


for(int index = 1; index < arr.length; index+=2){


arr[index] = index;



}

return arr;

}

}

