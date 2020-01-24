/*crear un método llamado clearSteps que reciba un arreglo y descarte todos los valores quesean menores a 200 o mayor a 100000. 
Los valores deben quedar como enteros (Integers) y el método debe retornar el arreglo filtrado.*/
package smartwatch;
import java.util.ArrayList;
import java.util.Scanner;
public class SmartWatch {

    public static void main(String[] args) {
        int i;
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        String steps = sc.nextLine();
        String arraySteps[]= steps.split(" ");
       
        for(i=0; i<arraySteps.length; i++){
            a.add(Integer.parseInt(arraySteps[i]));
        }
        int promedios = crearSteps(a);
        System.out.println(promedios);
    }
    
    static int crearSteps(ArrayList<Integer> a){
     int prom=0, sum=0, n = a.size();;
     for(int temp:a){
         if(temp<200 && temp>100000){
             sum= temp+sum;
         }
     }
     prom=sum/n;
        return prom;
    }
    
}
