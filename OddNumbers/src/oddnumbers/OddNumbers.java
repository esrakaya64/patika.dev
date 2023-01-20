package oddnumbers;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class OddNumbers {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int end = input.nextInt();
        //If we want to even number, we should say int i =0; at starting
        for(int i = 1; i <= end; i += 2){
            System.out.println(i);
        }
    }
    
}
