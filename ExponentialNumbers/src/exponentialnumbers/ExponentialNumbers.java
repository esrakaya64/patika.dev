
package exponentialnumbers;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class ExponentialNumbers {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = input.nextInt();
        System.out.println("Enter exponent number: ");
        int exponent = input.nextInt();
        int result = 1;
        for(int i = 1; i<=exponent; i++){
            result *= base;
        }
        System.out.println(base + " to " + exponent + " is " + result);
        
    
    }
    
}
