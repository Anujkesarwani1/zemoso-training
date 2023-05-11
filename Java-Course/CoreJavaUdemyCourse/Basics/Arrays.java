package Basics;

public class Arrays {
    public static void main(String[] args) {
        // Arrays
        int number1 = 10;
        int[] arr = new int[5];
        int[] arr1 = {15, 20, 25, 30, 35};
        System.out.println(arr1[3]);
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Index no. " + i + " = " + arr[i]);
        }
    }
}
