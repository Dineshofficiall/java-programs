package oops.inheritance.multipleInheritance;

class A {
    public void displayA(){
        System.out.println("A Method");
    }
}
class B extends A{
    public void displayB(){
        System.out.println("B Method");
    }
}
class C extends B{
    public void displayC(){
        System.out.println("C Method");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}
