package Work.task2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Input 1 : ");
        int number1 = sc.nextInt();

        System.out.println("Enter the Operation [+, -, * ,/, %] : ");
        char symbol = sc.next().charAt(0);

        System.out.println("Enter the Input 2 : ");
        int number2 = sc.nextInt();
        op(number1,symbol,number2);


    }
    public static void op(int i, char a, int j){
            int result = 0;

            switch (a){
                case '+': result = i + j;
                    break;

                case '-': result = i - j;
                    break;

                case '*': result = i * j;
                    break;

                case '/': result = i / j;
                    break;

                case '%': result = i % j;
                    break;

                default:
                    System.out.println("Invalid Input ");
            }
            System.out.println("[Number 1] : "+ i + " ['" + a + "'] " + "[Number 2] :" + j + " [Result] : " + result);
        }
}
