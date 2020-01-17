/* Dado un arreglo de enteros
Realizar las siguientes operaciones: 
1. Utilizando reduce, sumar todos los valores del array
2. Utilizando reduce, sumar todos los valores no repetidos del array
3. Convertir todos los datos al tipo float
4. Filtrar todos los elementos menores a 5 sin repetir
5. Utilizando mapToInt, sumar todos los valores del arreglo
6. Utilizando .count() contar todos los elementos menores que 5
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayEjercicio {

    public static void main(String[] args) {
        
       List<Integer> numeros = Arrays.asList(1,9,2,10,2,4,7,4,7,1,4);
       
       //1. Utilizando reduce, sumar todos los valores del array
       int suma = numeros.stream().reduce(0, (a,b) -> a+b);
       System.out.printf("El resultado de sumar los valores del array \n"+numeros +"\n es:"+suma);
       
       //2. Utilizando reduce, sumar todos los valores no repetidos del array
       List<Integer> noRepeatNum = numeros.stream().distinct().collect(Collectors.toList());
       int sumNorepeat = noRepeatNum.stream().reduce(0, (a,b)->a+b);
        System.out.printf("\n El resultado de sumar los valores del array no repetidos es:"+sumNorepeat);
        
       //3. Convertir todos los datos al tipo float
       List<Float> floatNums = numeros.stream().map(c->(float)c).collect(Collectors.toList());
       System.out.printf("\n El resultado de convertir los valores del array a tipo float es \n:"+floatNums);
       
       //4. Filtrar todos los elementos menores a 5 sin repetir
       List<Integer> numMinFive = numeros.stream().distinct().filter(a -> a<=5).collect(Collectors.toList());
       System.out.printf("\n El resultado de filtrar los valores del array por los menores a 5 es \n:"+numMinFive);
       
       //5. Utilizando mapToInt, sumar todos los valores del arreglo
       int sumaInt = numeros.stream().mapToInt(Integer::intValue).sum();
       System.out.printf("\n El resultado de sumar todos los valores del arreglo con mapToInt es \n:"+sumaInt);
       
       //6. Utilizando .count() contar todos los elementos menores que 5
       int countNumMinFive = (int) numeros.stream().filter(a-> a<5).count();
       System.out.printf("\n El resultado de sumar todos los valores del arreglo menores de 5 con count es \n:"+countNumMinFive);
    }

}
