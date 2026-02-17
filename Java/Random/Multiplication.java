import java.util.Scanner;
public class Multiplication {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n Multiplication table");
        System.out.println("1. Table A");
        System.out.println("2. Table B");
        System.out.println("3. Quit");
         System.out.println("\n Choose from 1 to 3: ");
         if (!sc.hasNextInt()) {
             sc.next();
              System.out.println("Bad Choice");
              sc.close();
              return; 
         }
         int choice = sc.nextInt();
         switch (choice) {
             case 1, 2 -> {
                 System.out.println("\n Multiplication table of positive integers greater than zero");
                 boolean limited = (choice == 2);
                 int num = 0, max = 0, invalid = 0;
                 while (num <= 0) {
                     System.out.print("Enter the number you want the multiplication table for: ");
                     if (sc.hasNextInt()) num = sc.nextInt();
                     else sc.next();
                     if (num <= 0 && limited && ++invalid == 5) {
                          System.out.println("Stop...Can't read rules huh???");
                          sc.close();
                          return;
                     }
                 }
                 invalid = 0;
                 while (max <= 0) {
                      System.out.print("Enter the max multiplier (must be greater than 0): ");
                      if (sc.hasNextInt()) max = sc.nextInt();
                      else sc.next();
                      return;
                 }
             }
              System.out.println("\nMultiplication Table for" + num + ":");
              for (int i = 1; i <= max  ; i++)
              System.out.println(num+ "×" + "=" +(num * i));
         }
         case 3 -> System.out.println("Exiting Goodbye!");
         default -> System.out.println("Bad choice");
    }
    sc.close();
}
}
