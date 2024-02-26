package Threads;

class Students{
    void timeTable(){

        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("Class xth std");
                switch (i){
                    case 1:
                        System.out.println("English Subject Starts @ : 10:00");
                        System.out.println("Faculty 'A'" +"\n");
                        break;
                    case 2:
                        System.out.println("Tamil Subject Starts @ : 10:50");
                        System.out.println("Faculty 'B'" +"\n");
                        break;
                    case 3:
                        System.out.println("Maths Subject Starts @ : 11:40");
                        System.out.println("Faculty 'C'" +"\n");
                        break;
                    case 4:
                        System.out.println("Science Subject Starts @ : 12:30");
                        System.out.println("Faculty 'C'" +"\n");
                        break;
                    case 5:
                        System.out.println("Social Subject Starts @ : 01:10");
                        System.out.println("Faculty 'D'" +"\n");
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Faculty{
    void timeTable(){
        System.out.println("\n"+"Faculty Schedule to xth std class"+"\n");
        for (int i = 1; i < 6; i++) {
            switch (i){
                case 1:
                    System.out.println("Class xth Starts @ : 10:00 Faculty 'A'" +"\n");
                    break;
                case 2:
                    System.out.println("Class xth Starts @ : 10:50 Faculty 'B'" +"\n");
                    break;
                case 3:
                    System.out.println("Class xth Starts @ : 11:40 Faculty 'C'" +"\n");
                    break;
                case 4:
                    System.out.println("Class xth Starts @ : 12:30 Faculty 'C'" +"\n");
                    break;
                case 5:
                    System.out.println("Class xth Starts @ : 01:10 Faculty 'D'" +"\n");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Students stu = new Students();
        Faculty faculty = new Faculty();

        stu.timeTable();
        faculty.timeTable();
    }
}
