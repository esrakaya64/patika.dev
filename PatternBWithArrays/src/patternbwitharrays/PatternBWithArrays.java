/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternbwitharrays;

/**
 *
 * @author Esra Kaya
 */
public class PatternBWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

         String[][] list = new String[7][4];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    list[i][j] = " * ";
                } else {
                    list[i][j] = "   ";
                }
            }
        }
        for (String[] row : list) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
    
}
