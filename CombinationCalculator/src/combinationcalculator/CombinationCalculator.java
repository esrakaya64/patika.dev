
package combinationcalculator;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class CombinationCalculator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n for [C(n, r)].");
        int n = input.nextInt();
        System.out.println("Enter number r for [C(n, r)].");
        int r = input.nextInt();
        //result = n! / (r! * (n-r)!)
        int nFactorial = 1;
        for(int i = 1; i <= n; i++){
            nFactorial *= i;
        }
        int rFactorial = 1;
        for(int i = 1; i <= r; i++){
            rFactorial *= i;
        }
        int x = n-r;
        int xFactorial = 1;
        for(int i = 1; i <= x; i++){
            xFactorial *= i;
        }
        double result = nFactorial / (rFactorial *  xFactorial);
        System.out.println("C(" + n + "," + r + ")! = " + result);
    }
    
}
