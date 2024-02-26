package Work;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
//        1.Write a Java program to get a number from the user and print.
//          whether it is positive or negative
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Input : ");
        int userInput = sc.nextInt();

        if(userInput % 2 == 0){
            System.out.println("Positive Number : " + userInput);
        }else {
            System.out.println("Negative Number : " + userInput);
        }

//        2.  Write a Java program that takes a year from the user and prints.
//        whether it is a leap year or not.
        System.out.println();

        System.out.print("Enter the Year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0)&&(year % 100 != 0) || (year % 400 == 0)){
            System.out.println("It's an Leap Year : " + year);
        }else {
            System.out.println("It's not an leap Year : " + year);
        }

//        3.  Write a Java program to display the first 10 natural numbers.
//        (using for & while loop)
        System.out.println();

        int naturalNumbers = 10, i = 1;
        while (i <= naturalNumbers){
            System.out.println("Natural Number" + i);
            i++;
        }

//        4.  Write a program in Java to input 5 numbers.
//        find their sum and average.
//        (Using for & while loop)
        System.out.print("How Many Inputs Do you Want? : ");
        int iterations = sc.nextInt(), mark = 0;
        int []arr = new int[iterations];
        for (int num = 0; num < iterations; num++){
            System.out.print("Enter the input of " + num +" : ");
            arr[num] = sc.nextInt();
        }
        for (int k = 0; k < arr.length; k++){
            mark += arr[k];
        }
        System.out.println("Sum of User Gave Input is : " + mark);
        mark /= iterations;
        System.out.println("Avg of User Gave Input is : "+ mark);


//        5.  Write a Java program that displays the sum of n odd natural numbers.
//        (Using for & while loop)
        System.out.println();
        System.out.println("Enter the Natural Number is : ");
        int naturalNumber2 = sc.nextInt(), temp = 0;
        while (temp < naturalNumber2){
            if (temp % 2 == 0){
                temp++;
            }else {
                System.out.println("NaturalNumber of Odd is : " + temp);
                temp++;
            }
        }

//        6.  Write a Java program
//        to display the pattern like a right angle triangle with a number
/*          1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
 */
        System.out.print("Enter the Star Pattern : ");
        int star = sc.nextInt();
        for (int row = 1; row <= star; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

//        7. Write a Java program to make such a pattern like a pyramid with a number.
//        that repeats in the same row.
        /*
                    1
                   2 2
                  3 3 3
                 4 4 4 4
         */
        System.out.print("Enter the Pyramid Pattern : ");
        int pyramid = sc.nextInt();
        for (int row = 1; row <= pyramid; row++){
            for (int space = pyramid; space >= row; space--){
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print(col + "   ");
            }
            System.out.println();
        }

//        8. Write a Java program to generate the following * triangles.
            /*
                ******
                  *****
                    ****
                      ***
                        **
                          *
             */
        System.out.print("Enter the Right Pattern : ");
        int right = sc.nextInt();
        for (int row = 1; row <= right; row++){
            for (int rightSpace = 1; rightSpace <= row; rightSpace++){
                System.out.print(" ");
            }
            for (int col = right; col >= row; col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
