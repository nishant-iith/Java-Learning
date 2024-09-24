package Basics;

public class string {
    public static void main(String[] args){
        // string assignment
        String name = "Nishant Verma";

        // for the length of the string there is inbuilt function called length() // also includes spaces
        int len = name.length();
        System.out.println(name + " has length " + len);

        // another function is charAt(idx)
        char ch = name.charAt(0);
        System.out.println(name + " has its 0th index character as " + ch);

        // another function is substring 
        // substring(idx1) - from index idx to the end of the string
        System.out.println(name + "has substring from 2nd index onwards as " +name.substring(2));
        // pr substring(idx1, idx2) - from index idx1 to the idx2 -1, 
        // idx1 is inclusive and idx2 is exclusive
        System.out.println(name + "has substring from 2nd index to the 6th - 1 index as " + name.substring(2, 6));

        // string concatination
        String f_name = "Nishant";
        String s_name = "Verma";
        String name2 = f_name + " " + s_name;

        System.out.println(name2);

        // WHAT IF YOU try to change the string f_name
        f_name += " " + s_name;
        System.out.println("Changing the First name : " + f_name);

        // equals ??
        boolean result = f_name.equals(s_name);
        System.out.println("The first name is equal to second name: " + result);
    }
}
