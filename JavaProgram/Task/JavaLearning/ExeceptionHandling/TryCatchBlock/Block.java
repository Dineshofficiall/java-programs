package ExeceptionHandling.TryCatchBlock;

import java.util.Scanner;

//Para 1

//try block is used to check whether the element is true or not if it's true
//Then it shows true statements and if it's false
//Then it throws and red color error but if we use try catch
//Then it will shows an text error, That's easier to find the error.

//Para 2

//If we got an multiple Errors in the console and if we using the try catch block
//Then it only find the first of the listed errors and
//Will not going to find second & third etc..

//para 3

//Want to find the all error at same running time then
//We have to use the nested try catch block to identify the all listed errors



public class Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Input : ");
        int userInput = sc.nextInt();

        System.out.println();

        System.out.print("Second Input : ");
        int userSecondInput = sc.nextInt();

        try{
            int result = userInput/userSecondInput;
        }
        catch (Exception e){
            System.out.println("Error Occurred " + e);
        }
    }
}
