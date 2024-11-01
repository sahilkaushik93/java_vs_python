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
 * 5. Inverted Half Pyramid (rotated by 180 deg.)==>    *
 *                                                     **
 *                                                    ***
 *                                                   ****
 * 6. Half Pyramid with Numbers => 1
 *                                 1 2
 *                                 1 2 3
 *                                 1 2 3 4
 *                                 1 2 3 4 5  
 * 7. Inverted Half Pyramid ==> 1 2 3 4
 *                              1 2 3
 *                              1 2
 *                              1
 * 8. Floyd's Triangle => 1
 *                        2 3
 *                        4 5 6
 *                        7 8 9 10
 *                        11 12 13 14 15
 * 9. 0-1 Triangle => 1
 *                    0 1
 *                    1 0 1
 *                    0 1 0 1
 *                    1 0 1 0 1
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

        // 3. HALF PYRAMID: 
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

        // 4. INVERTED HALF PYRAMID: 
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

        System.out.println("\n__________Inverted Half Pyramid - 180 degrees_________\n");

        // 5. INVERTED HALF PYRAMID - ROTATED BY 180 DEGREE: 
        // Note: Pattern contains (row-i) space & i star, thus 2 inner loops required.
        // Outer Loop
        for(int i = 1;i <= row;i++){

            // Inner Loop 1 -> to print "space"
            for(int j = 1;j <= row-i;j++){
                System.out.print(" ");
            }

            // Inner Loop 2 -> to print "*"
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n__________Half Pyramid With Numbers_________\n");

        // 6. HALF PYRAMID WITH NUMBERS: 
        // Note: Stars printed are related to row number i.e. if row = 3 then 3 stars are printed and so on.
        // It will print series of star from one row to another row(COVERING ROWS)
        for(int i = 1;i <= row;i++){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= i;j++){
                    System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n__________Inverted Half Pyramid With Numbers_________\n");

        // 7. INVERTED HALF PYRAMID WITH NUMBERS: 
        // It will print series of star from one row to another row(COVERING ROWS)
        for(int i = row;i >= 1;i--){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= i;j++){
                    System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n__________Floyd's Triangle_________\n");

        // 8. Floyd's Triangle: 
        // It will print series of star from one row to another row(COVERING ROWS)
        int n = 1;
        for(int i = 1;i <= 5;i++){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= i;j++){
                System.out.print(n+" ");  
                n++;  
            }
            
            System.out.println();
        }

        System.out.println("\n__________0-1 Triangle_________\n");

        // 9. 0-1 Triangle: 
        // Here, if i+j = Even then print 1 else print 0.
        // It will print 0 or 1 from one row to another row(COVERING ROWS)
        for(int i = 1;i <= row;i++){
            // It will print n stars in a single row(COVERING COLS)
            for(int j = 1;j <= i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }  
                  
            }
            
            System.out.println();
        }

        sc.close();
    }
}
