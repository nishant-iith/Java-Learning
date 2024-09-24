package Basics;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // container for storing same type of data
        int[] arr = new int[5]; // an array of 5 size is declared
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        arr[4] = scanner.nextInt();
        // arr[5] = scanner.nextInt();

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);

        // array length
        System.out.println("Length of array is: " + arr.length);

        // for loop
        for( int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] is : " + arr[i]);
        }

        scanner.close();
    }
}
