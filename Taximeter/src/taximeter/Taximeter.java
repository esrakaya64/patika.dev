package taximeter;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class Taximeter {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Distance traveled in km? : ");
        int km = input.nextInt();
        int starting = 10;
        double perKm = 2.20;
        double totalPrice = starting + (km * perKm);
        if(totalPrice < 20){
            System.out.println("Total price is " + 20);
        }
        else{
            System.out.println("Total price is " + totalPrice);
        }
        
    }
    
}
