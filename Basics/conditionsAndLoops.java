package Basics;
import java.util.Scanner;

public class conditionsAndLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the Age of the person: ");
        int age = 0;
        age = scanner.nextInt();
        String message = "";

        if(age >= 18){
            message = "Adult";
        }
        else{
            message = "Not Adult";
        }

        System.out.println(message);
        scanner.close();
    }
}
