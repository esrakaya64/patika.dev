package findinghypotenuse;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class FindingHypotenuse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter edge 1: ");
        int edge1 = input.nextInt();
        System.out.println("Enter edge 2: ");
        int edge2 = input.nextInt();
        
        double hypotenuse = Math.sqrt(edge1*edge1 + edge2*edge2);
        System.out.println("Hypotenuse is: " + hypotenuse);
    }
    
}
