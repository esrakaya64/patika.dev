package areaoftriangle;
import java.util.Scanner;
/**
 *
 * @author Esra Kaya
 */
public class AreaOfTriangle {
    
    public static void main(String[] args) {
        /*
        Our formula is:
        Perimeter of triangle = 2𝑢

         𝑢 = (a+b+c) / 2

         Area * Area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
       
    Scanner input = new Scanner(System.in);
        System.out.println("Enter edge 1");
        int edge1 = input.nextInt();
        System.out.println("Enter edge 2");
        int edge2 = input.nextInt();
        System.out.println("Enter edge 3");
        int edge3 = input.nextInt();
        
        int perimeter = edge1 + edge2 + edge3;
        double u = perimeter / 2;
        double fakeArea;
        fakeArea  = u * (u - edge1) * (u - edge2) * (u - edge3);
        double area = Math.sqrt(fakeArea);
        System.out.println("Area of triangle is: " + area);
        
        
        
        
        
        
    }
    
    }
    

