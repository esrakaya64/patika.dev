package harmonicseries;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class HarmonicSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        double n = input.nextDouble();
        double sum = 0.0;
        for(double i = 1.0; i <= n; i++){
            sum += (1/i);
        }
        System.out.println("Result is: " + sum);
    }
    
}
