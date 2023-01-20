
package powerof4loop;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class PowerOf4Loop {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        for(int i = 1; i <= a; i*=4){
            System.out.println(i + " ");
        }
        // If we want to power of 5's we would write  int i = 1; i <= a; i*5;
    }
}
