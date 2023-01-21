
package perfectnumbers;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        int sum =0;
        for(int i = 1; i < x; i++){
            if(x % i == 0){
                sum += i;
            }
        }
        if(sum == x)
            System.out.println( x + " is a perfect number");
        else
            System.out.println(x + " is not a perfect number");
    }
    
}
