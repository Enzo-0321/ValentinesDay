import java.util.*;
public class Factorial{
    static int num = 0;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean input = false;
        
        while (!input) {
            try {
                
                System.out.print("Enter a number (1-10 only): ");
                num = sc.nextInt();
                    
                if (num >= 1 && num <= 10){
                        input = true;
                } else {
                    System.out.println("Please enter a number between 1 and 10 only.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer number between 1 and 10.");
                sc.next();
            }
        }
        System.out.println("The factorial of " + num + " is " + that(num));
        sc.close();
    }
    static int that(int count) {
        if (count == 0 || count == 1) {
            return 1;
        }
        return count * that(count -1);
    }
     
}