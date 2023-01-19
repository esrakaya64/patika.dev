package activitychoosing;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 * 
 */
public class ActivityChoosing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Degree of weather? ");
        int degree = input.nextInt();
        if(degree<5)
            System.out.println("You can ski today!");
        else if(degree>5 && degree<15)
            System.out.println("You can go to cinema today!");
        else if(degree==15)
            System.out.println("You can go to cinema or go to picinc today!");
        else if(degree>15 && degree<=25)
            System.out.println("You can go to picnic today!");
        else if(degree>25)
            System.out.println("You can go swim today!!!");
       
        }
    
    }
    

