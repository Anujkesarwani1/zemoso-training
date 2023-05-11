package Basics;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Multidimensional Arrays, Nested for loops
        int[] oneDArray = {12, 24, 36};
        System.out.println(oneDArray[2]);
        int[][] multiDArray = {{2, 4, 6}, {3, 6, 9}, {4, 8, 12}};

        System.out.println(multiDArray[1][2]);
        System.out.println(multiDArray[2][1]);

        double[][] doubleArray = new double[4][2];
        doubleArray[2][1] = 2.6;
        System.out.println(doubleArray[2][1]);

        for(int i = 0; i < multiDArray.length; i++) {
            for(int j = 0; j < multiDArray[i].length; j++) {
                System.out.println("Index no. " + i + ", " + j + " = " + multiDArray[i][j]);
            }
        }
    }
}
