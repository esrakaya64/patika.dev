
package sortingarray;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class SortingArray {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the lenght of array : ");
        int n = input.nextInt();
        int[] list = new int[n];
        
        for (int i=0; i<list.length; i++){
            System.out.print("Enter element " + (i+1)+" : ");
            list[i]= input.nextInt();
        }

        int max;
        for (int i=0; i<list.length;i++){
            for(int j=i; j< list.length; j++){
                if(list[i]>list[j]){
                    max = list[i];
                    list[i]=list[j];
                    list[j] = max;
                }
            }
        }
        System.out.print("Sorting form : ");
        System.out.println(Arrays.toString(list));

        input.close();
    }
    
}
