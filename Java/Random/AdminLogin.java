import java.util.Scanner;

public class AdminLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "admin";
        String password = "admin";        
        String inputUser;
        String inputPass;

        do {
            System.out.print("Enter username (or type 'exit' to quit): ");
            inputUser = scanner.nextLine();

            System.out.print("Enter password(or type 'exit' to quit): ");
            inputPass = scanner.nextLine();

            if (inputUser.equals("exit") || inputPass.equals("exit")) {
                System.out.println("Exiting... Goodbye!");
                break; 
            }

            if (!inputUser.equals(username) || !inputPass.equals(password)) {
                System.out.println("Username or password is incorrect! Try again.");
                continue; 
            }

            if (inputUser.equals(username) && inputPass.equals(password)) {
                System.out.println("Login successful. Welcome Admin!");
                break; 
            } else {
                System.out.println("Unknown username. Try again.");
            }

        } while (true);
    }
}
