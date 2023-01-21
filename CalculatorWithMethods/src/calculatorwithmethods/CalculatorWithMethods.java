
package calculatorwithmethods;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class CalculatorWithMethods {

    static int sum(int a, int b){
        System.out.print("Result : ");
        return a+b;
    }
    static int minus(int a, int b){
        System.out.print("Result : ");
        return a-b;
    }
    static int multiple(int a, int b){
        System.out.print("Result : ");
        return a*b;
    }
    static double divide(int a, int b){
        System.out.print("Result : ");
        return a/b;
    }
    static int mod(int a, int b){
        System.out.print("Result : ");
        return a%b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = input.nextInt();
        System.out.println("Select operation "
                + "\n1)+"
                + "\n2)-"
                + "\n3)*"
                + "\n4)/"
                + "\n5)%");
        int select = input.nextInt();
        
        switch(select){
            case 1:
                System.out.println(sum(n1,n2));
                break;
            case 2:
                System.out.println(minus(n1,n2));
                break;
            case 3:
                System.out.println(multiple(n1,n2));   
                break;
            case 4:
                System.out.println(divide(n1,n2));
                break;
            case 5:
                System.out.println(mod(n1,n2));
        }
               
    }
    
}
