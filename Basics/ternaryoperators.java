package Basics;

public class ternaryoperators {
    public static void main(String[] args){
        // ternary operator
        // condition ? first : second
        // if condition is true then first will be executed otherwise second will be executed

        int num1 = 6;
        int num2 = 10;

        int num3 = 100;
        int num4 = 1000;

        boolean first = num1 > num2 || num3 < num4;
        boolean Second = num1 > num2 && num3 < num4;
        String result1 = first ? "True" : "False";
        String result2 = Second ? "True" : "False";
        System.out.println(result1);
        System.out.println(result2);

    }
}
