package Basics;

public class ArtOps {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        int num3 = num1 + num2;
        int num4 = num3 - num2;
        int num5 = num4 * num1;
        int num6 = num5/num2;
        int num7 = num3 % num2;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
        System.out.println("num5: " + num5);
        System.out.println("num6: " + num6);
        System.out.println("num7: " + num7);

        // ++num is preincrement
        // num++ is postincrement
    }
}
