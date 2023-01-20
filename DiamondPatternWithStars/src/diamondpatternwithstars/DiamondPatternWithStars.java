package diamondpatternwithstars;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class DiamondPatternWithStars {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size number: ");
        int size = input.nextInt();
        for (int i = 0; i <= size ; i++) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= size-1; i++) {
           
            for (int j = 0; j <= (i); j++) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <= (2*(size-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
        }
        
    }
    

