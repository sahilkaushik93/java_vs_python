import java.util.Scanner;
public class prog4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        // Conditional IF:-
        if(x>0){
            System.out.println("Positive Number !!");
        } 
        else {
            System.out.println("Negative Number !!");
        }

        // Conditional FOR loop:-
        for(int i = 0; i < 5; i++){
            System.out.println("Java for loop op:"+i);
        }
    }
}
