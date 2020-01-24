/* calcular el promedio de visitas diariasque recibe una página web y ejecutarlo desde consola
de la forma java Visitas.java 3001 1402 1304 1505
 */
package visitas;

import java.util.Scanner;
import java.util.ArrayList;

public class Visitas {

    public static void main(String[] args) {
        System.out.printf("Ingrese los datos a promediar separados por un espacio \n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(num);
        String[] arrNum = num.split(" ");

        for (int x = 0; x < arrNum.length; x++) {
            numbers.add(Integer.parseInt(arrNum[x]));
        }
        int promedios = promedio(numbers);
        System.out.println(promedios);
    }

    static int promedio(ArrayList<Integer> arr) {
        int sum = 0, n = arr.size();

        for (int i : arr) {
            sum = i + sum;
        }
        int prom = sum / n;
        return prom;
    }
}
