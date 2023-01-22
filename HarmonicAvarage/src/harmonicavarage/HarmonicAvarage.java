
package harmonicavarage;

/**
 *
 * @author Esra Kaya
 */
public class HarmonicAvarage {

    public static void main(String[] args) {
       double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += 1/numbers[i];
            
        }
        System.out.println("Harmonic series is : " + sum);
        System.out.println("Harmonic avarage is : " + numbers.length / sum);
        
    }
    
}
