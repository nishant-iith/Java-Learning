package Basics;

public class typeCasting {
    public static void main(String[] args) {
        // implict conversion (internally without any problem) but avoid using this method
        int x = 10;
        double y = x;
        System.out.println("x was an integer: " + x + ", y was double to which x was assigned then y becomes " + y);

        double y1 = 10.7;
        // int x1 = y1; // this will show an error
        int x1 = (int)y1; // double will be explicitly converted to int
        System.out.println(y1 + " was double which was converted to int as " + x1 );

        // final -> using final means we can't change the value;

        final int x2 = 10;
        // x2 = 5; not allowed
        System.out.println("x2 integer: " + x2);

    }
}
