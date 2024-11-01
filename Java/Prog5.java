/*
 * PATTERNS QUESTIONS
 * 1. Solid Rectangle ==> *****
 *                        *****
 *                        *****
 *                        *****
 * 2. Hollow Rectangle ==> *****
 *                         *   *
 *                         *   *
 *                         *****
 * 3. Half Pyramid ==> *
 *                     **
 *                     ***
 *                     ****
 * 4. Inverted Half Pyramid ==> ****
 *                              ***
 *                              **
 *                              *
 * Note: Rows -> Outer Loops; Cols -> Inner Loops
 */

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {

        System.out.println("\n__________Dimension Input_________\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRows:");
        int col = sc.nextInt();
        System.out.println("\nCols:");
        int row = sc.nextInt();

        System.out.println("\n__________Solid Rectangle_________\n");

        // 1. SOLID RECTANGLE:
        // It will print series of star from one row to another row(COVERING ROWS)
        for(int i = 1;i <= row;i++){
            System.out.println();
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= col;j++){
                System.out.print("*");
            }
        }

        System.out.println("\n__________Hollow Rectangle_________\n");

        // 2. HOLLOW RECTANGLE: 
        // Note: Stars are printed only for points where i=1 or j=1 or i=row or j=col.
        // It will print series of star from one row to another row(COVERING ROWS)
        for(int i = 1;i <= row;i++){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= col;j++){
                if(j==1 || j==col || i==1 || i==row){
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }

        System.out.println("\n__________Half Pyramid_________\n");

        // 3. HOLLOW RECTANGLE: 
        // Note: Stars printed are related to row number i.e. if row = 3 then 3 stars are printed and so on.
        // It will print series of star from one row to another row(COVERING ROWS)
        for(int i = 1;i <= row;i++){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n__________Inverted Half Pyramid_________\n");

        // 3. INVERTED HOLLOW RECTANGLE: 
        // Note: Stars printed are related to inverse row number i.e. if row = 3 then (total rows - 3)+1 stars are printed and so on.
        // It will print series of star from one row to another row(COVERING ROWS)
        for(int i = 1;i <= row;i++){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= (row-i) + 1;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
        // Alternate Approach:
        // Inverse Outer Loop Condition i.e. instead of increment, opt decrementing value
        // for(int i = row;i >= 1;i--){
        //     // It will print n stars in a single row(COVERING COLS)
        //     for(int j = 1;j <= i;j++){
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }



        sc.close();
    }
}
