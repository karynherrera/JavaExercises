/* identificar los patrones mostrados a continuación para luego poder dibujar cada uno de ellos
dependiendo el numero que ingrese el usuario
 */
package patrones;
import java.util.Scanner;

public class Patrones {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.printf("PATRONES \n");
      System.out.printf("Patrón 1: *.*.*.*.*.*.* \n");
      System.out.printf("Patrón 2: 12341234 \n");
      System.out.printf("Patrón 3: ||*||*||*||* \n");
      System.out.printf("\n Ingrese el numero de veces que será dibujado cada patron: ");
      int n = sc.nextInt();
      
      for(int i=0; i<n; i++){
          System.out.printf("*.");
          
      }
      System.out.println();
      for(int i=0; i<n; i++){
          for(int x=1; x<5; x++){
              System.out.printf(""+x);
          }
      }
      System.out.println();
      for(int i=0; i<n; i++){
          System.out.printf("||*");
          
      }
      
     
    }
    
}
