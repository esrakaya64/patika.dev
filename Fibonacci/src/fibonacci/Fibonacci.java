
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class Fibonacci {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of  elements");
        int n = input.nextInt();
        int temp = 0;
        int temp2 = 1;
        for(int i = 1; i <= n; i++){
           System.out.print(temp +" ");
           int sum = temp + temp2; 
           temp = temp2;
           temp2 = sum;
        }
    }
    
}
