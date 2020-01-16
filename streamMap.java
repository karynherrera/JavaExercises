/*Los Streams son una secuencia de datos o elementos, que provienen de una fuente de elementos 
(comolos ArrayList, listas, entre otros) y que permiten que se puedan realizar operaciones concatenadas sobresus  datos.  
Stream  nos  permite  realizar  operaciones  sobre  las  colecciones  de  datos  usando  el  modelofiltro, mapeo,reducción.*/
package javaapplication1;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class map {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1,4,8,5,5,10,2);
        List <Integer>numerosAumentados = new ArrayList<Integer>();
        /*creamos otra lista donde almacenarla, sino no se guarda al hacer el map*/
        numeros.stream().map(n->n*3).forEach(numerosAumentados::add);
        
        System.out.printf("numeros "+numeros +"\n");
        System.out.printf("numeros aumentados "+numerosAumentados);
    }

}
