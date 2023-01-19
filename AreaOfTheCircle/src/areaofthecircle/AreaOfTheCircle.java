package areaofthecircle;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class AreaOfTheCircle {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius? ");
        int r = input.nextInt();double pi = 3.14;
        double perimeter = 2 * pi * r;
        double area = pi * r * r;
        System.out.println("Area is " + area + " Perimeter is " + perimeter);
        System.out.println("What is the center angle of circle slice? ");
        int a = input.nextInt();
        double sliceArea = (pi * (r*r) * a) / 360;
        System.out.println("Area of circle slice is " + sliceArea);
    }
    
}
