
package muliplesof3and4;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class MuliplesOf3and4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int end = input.nextInt();
        for(int i = 0; i <= end; i++ ){
            if(i % 3 == 0 && i % 4 == 0)
                System.out.println(i);
        }
    }
    
}
