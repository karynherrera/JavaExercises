/*Desafío - Operaciones aritméticas
El  programa deberá pedir  3  resistencias, calcular la  resistencia total y 
mostrar el  resultado en  la consola
 */
package resistencia;

import java.util.Scanner;

public class Resistencia {

    public static void main(String[] args) {
        int r1, r2, r3;
        float sum, rt;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese resistencia 1: \n");
        r1 = sc.nextInt();

        System.out.printf("Ingrese resistencia 2: \n");
        r2 = sc.nextInt();

        System.out.printf("Ingrese resistencia 3: \n");
        r3 = sc.nextInt();

        if (r1 <= 0) {
            System.out.printf("Las resistencias no son distintas a cero.\n");
        } else if (r2 <= 0) {
            System.out.printf("Las resistencias no son distintas a cero.\n");
        } else if (r3 <= 0) {
            System.out.printf("Las resistencias no son distintas a cero.\n");
        } else {
            rt = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
            System.out.printf("La resistencia total es de " + rt);
        }

    }

}
