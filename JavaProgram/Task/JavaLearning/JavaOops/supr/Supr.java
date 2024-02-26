package oops.supr;


class Std1{
    String Name;
    public void Students(){
        Name = "Dinesh";
        System.out.println("Name : "+Name);
    }
}
class Std2 extends  Std1{
    String Name;
    public void Students(){
        Name = "Gopi";
        System.out.println("Name : "+Name);
        super.Students();
//        System.out.println(super.Students());
    }
}
public class Supr {
    public static void main(String[] args) {
        Std1 obj = new Std2();
        obj.Students();
    }
}
