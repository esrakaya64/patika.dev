
package factorialcalculator;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class FactorialCalculator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number!");
        int a = input.nextInt();
        int factorial = 1;
        for(int i = 1; i <= a; i++){
            factorial = factorial * i;
        }
        System.out.println(a + "! = " + factorial );
    }
    
}
