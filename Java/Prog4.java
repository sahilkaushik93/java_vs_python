/*
 * LOOPS
 * 1. for loop
 * 2. while loop
 * 3. do while loop
 * 
 * difference b.w. while & do-while is that task is executed atleast once in do-while.
 * while executes task if & only when it meets the condition.
 * 
 * RELATED QUESTION:
 * Print the sum of first n Natural Numbers
 * 
 */

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        // FOR LOOP
        /*
         * for(initialisation; condition; updation){
         * }
         */
        for(int i=0;i<11;i++){
            System.out.print(i + " ");
        }

        // WHILE LOOP
        /*
         * while(condition){}
         */
        System.out.println("");
        int i = 0;
        while(i<11){
            System.out.print(i + " ");
            i++;
        }

        // DO WHILE LOOP
        /*
         * do{
         * }while(condition);
         */
        System.out.println("");
        int j = 0;
        do{
            System.out.print(j+" ");
            j++;
        }while(j<11);

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Related Solution (Sum of first n natural numbers)
        int sum = 0; 
        for(int k = 0; k<=n; k++){
            sum += k;
        }
        System.out.println("\n"+sum);

        // Related Solution (Print the table of a number input by the user)
        int k = 1; 
        while(k<=10){
            System.out.print(k*n+" ");
            k++;
        }

        sc.close();
    }
}
