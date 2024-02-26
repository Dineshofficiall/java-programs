package loading;

public class Loading {
    public int addition(int num1, int num2){
        return num1+num2;
    }
    public double addition(int num1, double num2, int num3){
        return num1+num2+num3;
    }
    public double addition(double num1, double num2, int num3, double num4){
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) {
        Loading loading = new Loading();
        System.out.println("The First Addition Number : " + loading.addition(234,34));
        System.out.println("The Second Addition Number : " + loading.addition(23,23.343222,455));
        System.out.println("The Third Addition Number : " + loading.addition(1233.432, 2.12332, 34433,210.32));
    }
}
