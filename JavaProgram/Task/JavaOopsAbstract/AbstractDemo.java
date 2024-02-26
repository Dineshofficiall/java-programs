package Work.task3abstract;


import java.util.Scanner;

abstract class BankAccount{
    abstract void withdrawal();
    abstract void deposit();
    abstract void balance();
}
class SavingsAccount extends BankAccount{
    Scanner sc = new Scanner(System.in);
    double savingsWithdrawAmt = 0, savingsDepositAmt = 0, savingsBalance = 47599.322;
    void withdrawal(){
        System.out.print("Enter the Withdrawal amount : ");
        savingsWithdrawAmt = sc.nextInt();

        savingsBalance -= savingsWithdrawAmt;
        System.out.println("Withdrawal Successfully" + "\n" + "Current Bal : " + savingsBalance);
    }
    void deposit(){
        System.out.print("Enter the Deposit amount : ");
        savingsDepositAmt = sc.nextInt();

        savingsBalance += savingsDepositAmt;
        System.out.println("Deposit Successfully" + "\n" + "Current Bal : " + savingsBalance);
    }
    void balance(){
        System.out.println("Your Current Balance is : " + savingsBalance);
    }
}
class CurrentAccount extends BankAccount{
    Scanner scanner = new Scanner(System.in);
    double currentWithdrawAmt = 0, currentDepositAmt = 0, currentBalance = 1247599.322;

    void withdrawal(){
        System.out.print("Enter the Withdrawal amount : ");
        currentWithdrawAmt = scanner.nextInt();

        currentBalance -= currentWithdrawAmt;
        System.out.println("Withdrawal Successfully" + "\n" + "Current Bal : " + currentBalance);
    }
    void deposit(){
        System.out.print("Enter the Deposit amount : ");
        currentDepositAmt = scanner.nextInt();

        currentBalance += currentDepositAmt;
        System.out.println("Deposit Successfully" + "\n" + "Current Bal : " + currentBalance);
    }
    void balance(){
        System.out.println("Your Current Balance is : " + currentBalance);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
//      Object Creating

        BankAccount objSavings = new SavingsAccount();
        BankAccount objCurrent = new CurrentAccount();

//      Input
        Scanner scan = new Scanner(System.in);

//      Display on console
        System.out.println("Press 1 for Savings, Press 2 for Current : ");

//      Account Type /current /savings
        int accType = scan.nextInt();
        if (accType == 1){
            System.out.print("Savings Account" + "\n" + "Press 1 for Withdrawal" + "\n" + "Press 2 for Deposit" + "\n" + "Press 3 for BalanceEnquiry : ");

//          Input
            int userInput = scan.nextInt();
            switch (userInput){
                case 1: objSavings.withdrawal();
                    break;

                case 2: objSavings.deposit();
                    break;

                case 3: objSavings.balance();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
        else if(accType == 2) {
            System.out.print("Savings Account" + "\n" + "Press 1 for Withdrawal" + "\n" + "Press 2 for Deposit" + "\n" + "Press 3 for BalanceEnquiry : ");

//          Input
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    objCurrent.withdrawal();
                    break;

                case 2:
                    objCurrent.deposit();
                    break;

                case 3:
                    objCurrent.balance();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
        else {
                System.out.println("You Have Entered Wrong Input");
        }
    }
}
