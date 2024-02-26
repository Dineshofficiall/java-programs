package Work.task2;

import java.util.Scanner;

public class EvenOdd {
    public boolean isEvenOrOdd(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int userInput = sc.nextInt();

        EvenOdd obj = new EvenOdd();

        int i = 1;
        while(i <= userInput){
            System.out.println("You Entered Value of : " + i + " is " + obj.isEvenOrOdd(i));
            i++;
        }
    }
}
