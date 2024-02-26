package constructor;

public class DefaultConstructor {
    int number;
    double result;
    String Name;

    //  Default Constructor
    DefaultConstructor (){
        number = 89444;
        result = 34.2;
        Name = "Dinesh";
    }
    public static void main(String[] args) {
        DefaultConstructor constructor = new DefaultConstructor();
        System.out.println("Default Constructor : " + "\n"
                + "Number" + constructor.Name + "\n"
                + "Result" + constructor.result + "\n"
                + "Name" + constructor.Name);
    }
}

