/*Desafío - Operaciones aritméticas.
Dado un rectangulo, se requiere calcular su área y perímetro.
Además el programa recibirá un tercer valor, correspondiente a x, con el cual se deberá calcular el
área de nuevo rectángulo y su perímetro.
 */
package rectangulo;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese el alto del rectangulo \n");
        int alto = sc.nextInt();
        System.out.printf("Ingrese el largo del rectangulo \n");
        int large = sc.nextInt();
        System.out.printf("Ingrese un numero para calcular un nuevo rectangulo (separé el decimal por coma) \n");
        float x = (float) sc.nextFloat();

        //calculamos el área a=b.h del primer rectangulo
        int area1 = alto * large;
        //calculamos el perimetro p= 2.a+2.h del primer rectangulo
        int p1 = (2 * alto) + (2 * large);
        System.out.println( area1);
        System.out.println(p1);

        //calculamos los datos del segundo rectangulo
        float alto2 = (float) alto - (2*x);
        float large2 = (float) large - (2*x);

        if (alto2>0.0 &&large2 >0.0) {
            float area2 = alto2 * large2;
            float p2 = (2 * alto2) + (2 * large2);
            System.out.println(area2);
            System.out.println(p2);
        } else {
             System.out.printf("\n no se puede calcular la nueva área y perímetro \n");
        }

    }

}

