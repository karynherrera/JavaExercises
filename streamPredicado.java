/*
Predicado: En programación funcional, como es el uso de Streams, 
existen lo que se denomina predicado, que sonexpresiones  que  reciben  un  argumento  
y  devuelven  un  valor  luego  de  realizar  una  operación.
 */
package javaapplication1;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class predicado {

    public static void main(String[] args) {
       List<Integer> numeros = Arrays.asList(1,4,8,5,5,10,2);
       List<Integer> numerosAuno = numeros.stream().map(n->1).collect(Collectors.toList());
       System.out.printf("Numeros a uno \n"+numerosAuno);
       
       //Con limit(n) obtenemos los primeros n elementos del array original
       List<Integer> numerosLimit = numeros.stream().limit(2).collect(Collectors.toList());
       System.out.printf("\n Los primeros numeros del array: "+numeros +" son:\n " +numerosLimit);
       
       //Con skip(n) nos saltamos los primeros n elementos
       List<Integer> numerosSkip = numeros.stream().skip(2).collect(Collectors.toList());
       System.out.printf("Arreglo despues de saltar los primeros 2 numeros"
               + "\n" + numerosSkip);
    }
    
}
