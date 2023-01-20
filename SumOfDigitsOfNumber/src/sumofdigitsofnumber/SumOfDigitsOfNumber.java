
package sumofdigitsofnumber;
import java.util.Scanner;

/**
 *
 * @author Esra Kaya
 */
public class SumOfDigitsOfNumber {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int number= input.nextInt();
        int temp;
        int result=0;
        while (number != 0) {
            temp = number%10;
            result+=temp;
            number/=10;
        }
        System.out.println("Sum of the digits of this number: " + result);
        
    }
    
}
