
package javaapplication1;
import java.util.ArrayList;
import java.util.Arrays;

public class Filtrar {

    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(100,200,500,1000,500,2000,10));
       System.out.println(numeros);
       
       int i;
       int n= numeros.size();
       ArrayList<Integer> filterNumbers = new ArrayList<Integer>();
       
       for(i=0; i<n; i++){
           if(numeros.get(i)>=1000){
               filterNumbers.add(numeros.get(i));
           }
       }
       System.out.println(filterNumbers);
    }
    
}
