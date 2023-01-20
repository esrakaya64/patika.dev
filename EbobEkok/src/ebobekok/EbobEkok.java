
package ebobekok;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class EbobEkok {

    
    public static void main(String[] args) {
       int n1,n2,ebob=0,ekok,n;

        Scanner input = new Scanner(System.in);

        System.out.print("First number : ");
        n1 = input.nextInt();
        System.out.print("Second number : ");
        n2 = input.nextInt();

        if(n1 > n2)
            n = n2;
        else
            n = n1;


        int i = 1;

        while (i <= n){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }

        ekok = ( n1 * n2 ) / ebob ;

        System.out.println("EBOB  :  " + ebob);
        System.out.println("EKOK  :  " + ekok);

    }
}
    

