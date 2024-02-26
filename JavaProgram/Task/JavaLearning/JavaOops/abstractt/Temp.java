package oops.abstractt;

//abstract method
abstract class Company{
    abstract void machine();
    public void engineer(){
        System.out.println("Abstract normal method");
    }
}
class Company2 extends Company{
    void machine(){
        System.out.println("Abstract Class Called");
    }
}

public class Temp {
    public static void main(String[] args) {
        Company obj = new Company2();
        obj.machine();
        obj.engineer();
    }
}
