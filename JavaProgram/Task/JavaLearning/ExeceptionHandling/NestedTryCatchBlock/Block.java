package ExeceptionHandling.NestedTryCatchBlock;

public class Block {
    public static void main(String[] args) {
        try {

            try {
                int arr[] = new int[5];
                arr[6] = 2;
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                int a = 10 / 0;
            }catch (Exception e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
