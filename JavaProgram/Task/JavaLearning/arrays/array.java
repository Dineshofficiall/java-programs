package arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        two dimension
        int [][]arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][]arr1 = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };
        int [][]result = new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                    result[i][j] = arr[i][j];
            }
            for (int k = 0; k < arr1[i].length; k++){
                result[i][k] += arr1[i][k];
            }
        }
        for (int row = 0; row < result.length; row++){
            for (int column = 0; column < result[row].length; column++){
                System.out.print(result[row][column] + " ");
            }
            System.out.println();
        }
    }
}
