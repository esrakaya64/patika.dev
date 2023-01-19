package kdv;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class KDV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price");
        int price = input.nextInt();
        double kdv;
        if(price > 1000)
            kdv = price*8/100;
        else{
        kdv = price*18/100;
        }
        double newPrice = price + kdv;
        System.out.println("Price with kdv= " + newPrice);
      
        
        
        
    }
    
}
