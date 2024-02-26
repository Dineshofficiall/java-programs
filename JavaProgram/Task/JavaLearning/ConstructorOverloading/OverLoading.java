package ConstructorOverloading;

public class OverLoading {
    int num1, num2, num3, num4;
    OverLoading(int i, int j, int k){
        num1 = i;
        num2 = j;
        num3 = k;
    }
    OverLoading(int i, int j, int k, int z){
        num1 = i;
        num2 = j;
        num3 = k;
        num4 = z;
    }
    public void display(){
        System.out.println(num1+" "+num2+" "+num3+" "+num4);
    }
    public static void main(String[] args) {
        OverLoading obj1 = new OverLoading(11,244,432,343);
        OverLoading obj2 = new OverLoading(2,2,4);

        //obj calling
        obj1.display();
        obj2.display();
    }
}
