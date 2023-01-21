package fingingminandmax;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class FingingMinAndMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much number will you enter?");
        int size = input.nextInt();
        int temp;
        int minimum = 0;
        int maximum = 0;
        System.out.println("Enter number 1");
        temp = input.nextInt();
        for(int i = 2; i <= size; i++){
            System.out.println("Enter number " + i);
            int x = input.nextInt();
            if(x < temp){
                minimum = x;
            
            }
            if(x > temp){
                maximum = x;
            
            }
        }
        System.out.println("Mininmum value is " + minimum + "\nMaximum value is " + maximum);
        
    }
    
}
