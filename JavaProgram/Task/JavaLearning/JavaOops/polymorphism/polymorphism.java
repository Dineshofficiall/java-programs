package oops.polymorphism;

//ithu parent class la enna tha potalum child class la call pannumpothu override aagirum so ithu polymorphism.
//override aagurathu plain ahhh class la define panni atha modify panna mudiyathu only methods tha override panna mudiyum methods la data member create panni access pannikalam



class Vechical{
    public void display(){
        System.out.println("This is Vechical No Arguments");
    }
    public void display(int i){
        System.out.println("This is Vechical Single Argument Passed");
    }
}

class Car extends Vechical{
    public void display(){
        System.out.println("This is Car No Argument");
    }
    public void display(int i){
        System.out.println("This is Car Single Argument");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        car.display(5);
    }
}
