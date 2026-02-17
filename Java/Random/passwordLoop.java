import java.util.Scanner;
public class passwordLoop {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String PW = "password12345";
        
        System.out.print("Enter your password: ");
	    String input = sc.nextLine();

	    while (!input.equals(PW)) {
	        System.out.print("Wrong Password, try again: ");
	        input = sc.nextLine();
	    }

	    System.out.println("Access Granted");
        sc.close();
    }
}