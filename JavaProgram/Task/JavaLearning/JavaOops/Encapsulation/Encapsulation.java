package oops.Encapsulation;

class Demo{
    private int id;
    private double salary;
    private String name;
    private String phoneNumber;
    private String role;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getRole(){
        return this.role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public void display(){
        System.out.println("Id : " + getId() + "\n" + "Name : " + getName() + "\n" + "Role : " + getRole() + "\n" + "Phone Number : " + getPhoneNumber() + "\n" + "Salary : " + getSalary());
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Demo dc = new Demo();
        dc.setId(12);
        dc.setName("xyz");
        dc.setPhoneNumber("9080333435");
        dc.setRole("Developer");
        dc.setSalary(34343);

        dc.display();
    }
}
