package recursiveexponentialnumbers;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class RecursiveExponentialNumbers {
    static int exp(int a, int b){
        if(b!=0){
            return a*exp(a,b-1);
        }else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = input.nextInt();
        System.out.println("Enter exponential: ");
        int exponential = input.nextInt();
        System.out.print("Result is: ");
        System.out.println(exp(base,exponential));
        
    }
    
}
