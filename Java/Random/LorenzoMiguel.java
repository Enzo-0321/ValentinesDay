import java.util.*;
public class LorenzoMiguel {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String name, block, age;
        int sum, diff, prod;

        System.out.print("Please enter your name: " );
        name = sc.nextLine();
        System.out.print("Please enter your year and block: ");
        block = sc.nextLine();
        System.out.print("Please enter your age: ");
        age = sc.next();
        sum = (age.charAt(0) - '0') + (age.charAt(1) - '0');
        diff = (age.charAt(0) - '0') -  (age.charAt(1) - '0');
        prod = (age.charAt(0) - '0') *  (age.charAt(1) - '0');

        System.out.println("==========OUTPUT===========\n");
        System.out.println("I am " + name);
        System.out.println(block);
        System.out.println(age + "\n");
        System.out.println("Sum of digits on my age is: " + sum);
        System.out.println("Difference of  digits on my age is: " + diff);
        System.out.println("Product of digits on my age is: " + prod + "\n");
        System.out.println("My name in vertical: ");
        for (int i = 0; i < name.length(); i++)
        System.out.println(name.charAt(i));
    }
}