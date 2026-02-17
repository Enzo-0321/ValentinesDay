import java.util.Scanner;
public class password {
    public static void main(String [] args) {
    
    String password;
    String input = "";
    String input1 = ""; 
    String email;
    String email1;
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Account Creation");
    System.out.print("Enter your gmail address : ");
    email = sc.nextLine().toLowerCase();
    System.out.print("Create your password: ");
    password = sc.nextLine();
    System.out.print("Repeat your password: ");
    input = sc.nextLine();
        
        while (!input.equals(password)) { 
        System.out.print("Incorrect password, try again: "); 
        input = sc.nextLine();
            
        if (!input.equals(password)); {
         System.out.println("Your Account has been saved");

        }
        }
        System.out.println("------------LOG IN--------------");
               
        System.out.print("Enter your gmail address : ");
        email1 = sc.nextLine();

        while (!email1.equals(email)) {
        System.out.print("Invalid gmail. Please try again: ");
        email1 = sc.nextLine();
        }

            System.out.print("Enter your password : ");
            input1 = sc.nextLine();

            while (!input1.equals(password)) {
            System.out.print("Password Incorrect. Please try again: ");
            input1 = sc.nextLine();
            }
            
            System.out.println("Access Granted");
            sc.close();
    }
}
                       
                    
                 
                    
                
          
                

