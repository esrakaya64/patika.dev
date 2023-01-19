package greengroser;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class GreenGroser {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11 , bananaPrice = 0.95 , eggplantPrice = 5.00 ;
        System.out.println("How many kg of pears do you want,?");
        double pear = input.nextDouble();
        System.out.println("How many kg of apples do you want,?");
        double apple = input.nextDouble(); 
        System.out.println("How many kg of tomatoes do you want,?");
        double tomatoes = input.nextDouble();  
        System.out.println("How many kg of bananas do you want,?");
        double banana = input.nextDouble();   
        System.out.println("How many kg of eggplants do you want,?");
        double eggplant = input.nextDouble();
        double price = (pearPrice * pear) + (applePrice * apple) + (tomatoesPrice * tomatoes) + (eggplantPrice * eggplant);
        System.out.println("Total price is " + price);
    }
    
}
