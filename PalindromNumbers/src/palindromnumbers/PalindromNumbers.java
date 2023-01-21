
package palindromnumbers;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class PalindromNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = sc.nextInt();
        isPalindrom(number);
        if (isPalindrom(number)) {
            System.out.println("It is a palindrom number");
        }else {
            System.out.println("It is not a palindrom number");
        }
    }
    
    static boolean isPalindrom(int number){
        
       int temp = number, inverse = 0, x; 
        while (temp != 0) {
            x= temp%10;
            inverse = (inverse*10)+x;
            temp/=10;
        } 
        return number == inverse;
    }
}
