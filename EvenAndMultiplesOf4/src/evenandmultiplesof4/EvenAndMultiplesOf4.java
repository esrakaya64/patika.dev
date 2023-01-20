
package evenandmultiplesof4;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class EvenAndMultiplesOf4 {
/*
    With Java loops, we write a program that accepts input from the user until
    a single number is entered and adds even and multiples of 4 from the 
    entered values and prints it on the screen.
    */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int counter = 0;
        do{
        System.out.println("Enter a number");
        i = input.nextInt();
            if(i % 4 == 0)
                counter += i;   
        }while(i % 2 == 0);
        System.out.println("The sum of the numbers that are a multiple of 4 between the values you entered is " + counter);
         
        
    }
}


    

    

