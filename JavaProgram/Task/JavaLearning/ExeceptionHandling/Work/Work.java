package ExeceptionHandling.Work;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if (number < 18){
            try{
                
            }catch (Exception e){

            }
        } else if (number >= 18) {
            System.out.println("Right to Vote");
        }
        else {
            System.out.println("invalid Input");
        }
    }
}