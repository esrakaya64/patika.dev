package calculator;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = input.nextInt();
        System.out.print("Second number: ");
        int number2 = input.nextInt();
        System.out.println("1) + \n 2) - \n 3) * \n 4) /");
        System.out.println("Operation number: ");
        int operation = input.nextInt();
        switch(operation){
            case 1 : System.out.println("Result is" + " " + (number1 + number2));
            break;
            case 2 : System.out.println("Result is" + " " + (number1 - number2));
            break;
            case 3 : System.out.println("Result is" + " " + (number1 * number2));
            break;
            case 4 : 
                switch(number2){
                    case 0 : System.out.println("divisor cannot be zero");
                    break;
                    default : System.out.println("Result is" + " " + (number1 / number2));
                }
            
           
                
        }
    }
    
}
