/*
 * CONDITIONAL STATEMENTS
 * 1. if-else
 * 2. else-if
 * 3. switch
 * 4. break
 */

import java.util.*; 

public class Prog3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        //if-else & else-if
        if(age > 18){
            System.out.println("You Are An Adult !!");
        } else if(age < 18 & age > 13){
            System.out.println("You Are Adolscent !!");
        }
        else{
            System.out.println("You Are Not Adult !!");
        }        
    }
}




