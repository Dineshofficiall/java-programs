package Work.task2;

import java.util.Scanner;

public class LeapYear {

    public static String year(int number){
        if ((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0)){
            return "It's Leap Year : " + number;
        }
        else {
            return "It's not an Leap Year : " + number;
        }
    }

//    Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Input : ");
        int userInput = sc.nextInt();

        System.out.println((year(userInput)));
    }
}
