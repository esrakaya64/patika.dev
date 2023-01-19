package flightticket;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 * 
 */
public class FlightTicket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Distance(KM): ");
        int distance = input.nextInt();
        System.out.println("Travel type ?\n1)Round-Trip\n2)One way");
        int type = input.nextInt();
        double price = distance * 0.10;
        double newPrice;
        
        if(age < 12){
            newPrice = price/2;
            if(type == 1){
               double newPrice2 = newPrice * 0.8;
                System.out.println("Price is " + newPrice2);
            }
            else{
                System.out.println("Price is " + newPrice);
            }
        }
        if(age >= 12 && age <24){
            newPrice = price * 0.9;
            if(type == 1){
               double newPrice2 = newPrice *  0.8;
                System.out.println("Price is " + newPrice2);
            }
            else{
                System.out.println("Price is " + newPrice);
            }
        }
        if(age > 65){
            newPrice = price * 0.7;
            if(type == 1){
               double newPrice2 = newPrice * 0.8;
                System.out.println("Price is " + newPrice2);
            }
            else{
                System.out.println("Price is " + newPrice);
            }
        }
    }
    
}
