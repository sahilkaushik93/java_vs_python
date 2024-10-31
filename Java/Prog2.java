/*
 * How to give Output ?
 * How to define variables ?
 * How to define data types ?
 * How to take Input ?
 */

import java.util.*;

public class Prog2 {
    public static void main(String[] args) {
    
    // PRINTING OUTPUT
    /*
     * "System": It is a class, that contains some objects.
     * 
     * "System.out.print":
     * By Default: 'print' function doesn't provide feature of next line
     * If want to print next statement in next line use "\n".
     * 
     * "System.out.println":
     * By Default: 'println' function provides feature of next line.
     * shortcut key to get it: sout + TAB or sysout + TAB
     * 
     * 
     * Related Question:
     * Print Below pattern:
     *   *
     *   **
     *   ***
     *   ****
     */
    System.out.println("My Output with 'println' function");
    System.out.print("My Output with 'print' function 1 + ");
    System.out.print("My Output with 'print' funtion 2\n");
    System.out.print("My Output with 'print' funtion 3\n");
    System.out.println("My Output with 'print' funtion 4");
    System.out.println("\nRelated Question Solution:");
    System.out.print("*\n");
    System.out.print("**\n");
    System.out.print("***\n");
    System.out.print("****\n");
    

    // DEFINING VARIABLES    
    // DEFINING DATATYPES
    /*
     * 8 Primitive: byte(8 bit/1bytes), short, char(2 bytes), boolean(1 byte), int(4 bytes), long(8 bytes), float(4 bytes), double(8 bytes).
     * 5 Non-primitive: String, Array, Class, Object, Interface.
     */
    int a = 25;
    int b = 10;
    String name = "Tony Stark";
    name = "Iron Man";
    double c = a+b;
    System.out.println(c);
    System.out.println(name);


    // TAKING INPUT
    /*
     * In Java, we use 'Scanner' Class 
     * Scanner Class is present in 'Java.util' package: This package we import outside main class
     * We use 'System.in' to take input
     * next() function takes 'single token or single word' input
     * nextLine() function takes 'full line token' input
     * nextInt() takes integer input
     * nextFloat() takes floating input
     * nextDouble() takes double 
     */
    Scanner sc = new Scanner(System.in);
    String name1 = sc.next();
    System.out.println(name1);
    int a1 = sc.nextInt();
    System.out.println(a1);
    sc.close();
    }
}
