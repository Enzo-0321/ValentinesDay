import java.util.*;
public class LorenzoSanJuan {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        double height, weight, bmi;
        float bmiFloat;
        int bmiInt;

        System.out.print("Please enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Please enter your height in meters: ");
        height = sc.nextDouble();

        bmi = weight/Math.pow(height, 2);
        System.out.println("BMI (double)" + bmi);
        bmiInt = (int) bmi;
        System.out.println("BMI (int): " + bmiInt);
        bmiFloat = (float) bmi;
        System.out.println("BMI (float): " + bmiFloat);

        if (bmi >= 0 && bmi <= 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI Category: Normal");
        } else if (bmi >=25 && bmi <= 29.9) {
            System.out.println("BMI Category: Overweight");
        } else if (bmi >=30 && bmi <= 39.9) {
            System.out.println("BMI Category: Obese");
        } else if (bmi >=40) {
            System.out.println("BMI Category: Severe Obesity");
        }
    }
}
