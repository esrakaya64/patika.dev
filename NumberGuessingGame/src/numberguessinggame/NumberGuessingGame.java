
package numberguessinggame;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class NumberGuessingGame {

    public static int guess(){
        Scanner sc = new Scanner(System.in);
        System.out.print("GUESS A NUMBER BETWEEN 0 AND 100 :");
        return sc.nextInt();
        
    }
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        //System.out.println(number);
        int right = 5;
        boolean isWin = false;
             while (right > 0){
            if(guess() == number){
                isWin = true;
                break;
            }
            right--;
                 System.out.print("Try again... ");
        }

        if (isWin){
            System.out.println("TURE - You guess the number at " + (6-right) + ". guess");
        }else {
            System.out.println("GAME OVER..");
        }
    }
    
}

