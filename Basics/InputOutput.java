package Basics;
import java.util.Scanner; // importing Scanner from java utility

public class InputOutput {
    // The main method is the entry point of the program Basics.main will be exceulted first
    public static void main(String[] args){
        // Need to create an object 
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // reads interger from terminal
        System.out.println("Number: " + number);

        // reading inputs one by one - space seperated 
        String f_name = scanner.next();
        String s_name = scanner.next();
        System.out.println(f_name + ";" + s_name);
        scanner.close();// scanner needs to be closed
    }
}
