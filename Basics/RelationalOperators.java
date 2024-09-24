package Basics;

public class RelationalOperators {
    public static void main(String[] args){
        // realtaional operators are 
        // ==, !=, <=, >=, >, < returns a boolean value

        int num1 = 5;
        int num2 = 10;

        boolean exp1 = num1 == num2;
        boolean exp2 = num1 != num2;
        boolean exp3 = num1 < num2;
        boolean exp4 = num1 > num2;
        boolean exp5 = num1 <= num2;
        boolean exp6 = num1 >= num2;
        

        System.out.println("exp1: " + exp1);
        System.out.println("exp2: " + exp2);
        System.out.println("exp3: " + exp3);
        System.out.println("exp4: " + exp4);
        System.out.println("exp5: " + exp5);
        System.out.println("exp6: " + exp6 + "\n");

        // Logical operators 
        // && and || 
        boolean first = true;
        boolean second = false;

        boolean res1 = first && second;
        boolean res2 = first || second;
        System.out.println("res1: " + res1);
        System.out.println("res2: " + res2);
    }
}
