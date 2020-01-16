package practicejava;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class PracticeJava {

    public static void main(String[] args) {
       List<Integer> numeros = Arrays.asList(1,4,8,5,5,10,2);
       //creamos una lista y ahi guardamos los elementos elevados al cuadrado
       List<Integer> numerosAumentados2=numeros.stream().map(n-> n*n).collect(Collectors.toList());
       System.out.println(numeros);
       System.out.println(numerosAumentados2);
    }
    
}
