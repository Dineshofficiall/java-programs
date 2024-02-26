package constructor;

public class ParameterConstructor {
    String Name;
    int age;
    String phoneNumber;
    String Address;
    ParameterConstructor (String userName, int userAge, String userPhoneNumber, String userAddress){
        Name = userName;
        age = userAge;
        phoneNumber = userPhoneNumber;
        Address = userAddress;
        System.out.println("Name : " + Name + "\n" +
                "Age : " + age + "\n" +
                "Phone Number : " + phoneNumber + "\n" +
                "Address ; " + Address);
    }
    public static void main(String[] args) {
        ParameterConstructor user1 = new ParameterConstructor("Dinesh",22,"9080333435","21,Keelavasal, Madurai");
        ParameterConstructor user2 = new ParameterConstructor("Suresh",20,"9080421435","231,Thiruvanmaiyur, Chennai");
    }
}
