/*este programa identifica los patrones mostrados a continuación para luego, 
dibujar cadauno de estos patrones.*/
package patronesanidados;
import java.util.Scanner;

public class PatronesAnidados {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.printf("PATRONES \n");
      System.out.printf("Patrón 1:\n *\n n=1 \n");
      
      System.out.printf("\n Ingrese el numero de veces que será dibujado cada patron: ");
      int n = sc.nextInt();
      
    }
    
    static void pattern1(){
      System.out.printf(" *.*.*.*.*.*.* \n");
    }
    static void pattern2(){
      System.out.printf(" *.*.*.*.*.*.* \n");
    }
    static void pattern3(){
      System.out.printf(" *.*.*.*.*.*.* \n");
    }
    static void pattern4(){
      System.out.printf(" *.*.*.*.*.*.* \n");
    }
    
}
