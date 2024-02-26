package arrays;

public class Array3d {
    public static void main(String[] args) {
        int [][][]arrays = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };

        for (int array = 0; array < arrays.length; array++){
            for (int row = 0; row < arrays[array].length; row++){
                for (int column = 0; column < arrays[array][row].length; column++){
                    System.out.print(arrays[array][row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
