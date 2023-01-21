
package recursiveprimenumbers;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class RecursivePrimeNumbers {
    static boolean isPrime(int x, int c){
        if (x <= 2) {
            return (x == 2) ? true : false;
        }
        if (x == c) {
            System.out.println("It is a prime numer");
            return true;
            
        }
        if (x % c == 0) {
            System.out.println("It is not a prime numer");
            return false;
        }
        return isPrime(x, c + 1);
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println(isPrime(a,2));
    }
    
}
