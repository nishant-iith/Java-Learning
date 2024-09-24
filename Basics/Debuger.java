package Basics;

public class Debuger {
    public static void main(String[] args){
        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2;
            System.out.println("num3 : " + num3);
        } 
        catch (Exception ex){
            System.out.println(ex);        
        }

        // if try has any exceptiont then catch is executed but
        // finally is always executed
        finally {
            System.out.println("Done");
        }
    }
}
