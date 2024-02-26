package Work.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int num = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Third Number : ");
        int num2 = sc.nextInt();

        System.out.println("Average of Three : " + average(num, num1, num2));
    }
    public static int average(int i, int j, int k){
        int result = i + j + k;
        return result /= 3;
    }
}
