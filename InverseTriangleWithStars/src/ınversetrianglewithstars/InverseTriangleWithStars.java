
package ınversetrianglewithstars;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class InverseTriangleWithStars {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the step number: ");
        int step = input.nextInt();
        
        for (int i = 0; i <= step-1; i++) {
            for (int j = 0; j <= (i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*(step-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
    }
    
}
