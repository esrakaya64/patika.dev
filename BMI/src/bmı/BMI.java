package bmı;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many m is your height? ");
        double height = input.nextDouble();
        System.out.println("How many kg is your weight");
        int weight = input.nextInt();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
    
}
