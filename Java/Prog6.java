/*
 * // PATTERN QUESTIONS
 * 1. Butterfly Pattern => *      *
 *      (for n = 4)        **    **
 *                         ***  ***
 *                         ********
 *                         ********
 *                         ***  ***
 *                         **    **
 *                         *      *
 * 2. 
 * 
 */

public class Prog6 {
    public static void main(String[] args) {
        // 1. BUTTERFLY PATTERN
        /*
         * Logic:
         * row1: 1 star + 6 space + 1 star
         * row2: 2 star + 4 space + 2 star
         * row3: 3 star + 2 space + 3 star
         * row4: 4 star + 0 space + 4 star
         * row5: 4 star + 0 space + 4 star
         * row6: 3 star + 2 space + 3 star
         * row7: 2 star + 4 space + 2 star
         * row8: 1 star + 6 space + 1 star
         * 
         * The pattern is repeating inversly after 4th row 
         * Pattern: [(i)star + (8-2i)space + (i)star]
         * Here, space is 2(n-i) => 2(4-i) => 8-2i (As n is 4 in this case).
         */

        // First 4 rows:
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= (8-(2*i)); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Last 4 rows:
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= (8-(2*i)); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
