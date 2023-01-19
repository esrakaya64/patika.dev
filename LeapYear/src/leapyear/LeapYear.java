
package leapyear;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        if(year%4 == 0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a leap year");
                }
                 else{
                    System.out.println("It is not a leap year");
                }
            }
            else{
                System.out.println("It is not a leap year");
            }
           
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
    
}
