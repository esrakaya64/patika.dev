
package nearestnumber;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class NearestNumber {


    public static void main(String[] args) {
       
        
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = input.nextInt();
        input.close();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Value is " + min);
        System.out.println("Maximum Value is " + max);
        System.out.println("Number: " + a);

        int smallNearest = min;
        int bigNearest = max;

        for (int i : list) {
            if (i < a) {
                smallNearest = (a - smallNearest < a - i) ? smallNearest : i;
            } else if (i > a) {
                bigNearest = (bigNearest - a < i - a) ? bigNearest : i;
            }
        }

        System.out.println("Small nearest number : " + smallNearest);
        System.out.println("Big nearest number: " + bigNearest);

        

    }
    

