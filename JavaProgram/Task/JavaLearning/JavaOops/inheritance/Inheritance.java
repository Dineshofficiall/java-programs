package oops.inheritance;

import java.util.Scanner;

class Human{
    String Gender;
    String color;
}
class Male extends Human{
    public String display(String gen, String col){
        return gen + " " + col;
    }
}
class Female extends Human{
    public String display(String gen, String col){
        return gen + " " + col;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Male obj = new Male();

        System.out.println("Enter the Male - Color : ");
        System.out.println(obj.display("Gender : " + "Male","Color : " + sc.nextLine()));

        Female obj1 = new Female();

        System.out.println("Enter the FeMale - Color : ");
        System.out.println(obj1.display("Gender : " + "Female","Color : " + sc.nextLine()));
    }
}
