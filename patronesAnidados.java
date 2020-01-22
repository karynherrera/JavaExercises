/*este programa identifica los patrones mostrados a continuación para luego, 
dibujar cadauno de estos patrones.*/
package patronesanidados;

import java.util.Scanner;

public class PatronesAnidados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("PATRONES \n");
        drawPattern(5);

        System.out.printf("\n Ingrese el numero de veces que será dibujado cada patron: ");
        int n = sc.nextInt();

    }

    static void drawPattern(int n) {
        int inx = 0, iny = 0;
        int matrix[][] = new int[n][n];

        for (int x = 0; x < matrix.length; x++) { /*dibujamos las filas*/
            System.out.printf("*");
            if (n == 1) {
                System.out.printf("\n");
            }
            for (int y = 0; y < matrix[x].length - 1; y++) { /*dibujamos las columnas*/   
                System.out.printf("*");

            }
            System.out.printf("\n");
        }
        System.out.printf("n=" + n);
    }

    
    static void showPattern() {
        
    }

}
