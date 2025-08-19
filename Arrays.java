import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int[] arr1 = {1,2,3};

//        System.out.println("Enter the array values :");
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.print(" " + j);
//        }
//
//        System.out.println();
//
//        // Multi-Dimensional Array
//        int [][]arr2 = new int[3][4];
//
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 4; j++) {
//                arr2[i][j] = (int)(Math.random() * 10);
//            }
//        }
//
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(" " + arr2[i][j]);
//            }
//            System.out.println();
//        }

        // Jagged Array

        int[][] arr3 = new int[3][];

        // Initialize the inner arrays (you can ask the user for their lengths too)
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("Enter the number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            arr3[i] = new int[cols];
        }

        // Input values
        System.out.println("Enter the values in the array:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Array:");
        for (int[] row : arr3) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // 3D Array
        int[][][] arr4 = new int[1][2][4];

        // Drawbacks of Array

    }
}
