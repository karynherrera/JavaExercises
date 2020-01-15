
package javaapplication1;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {

    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Chile");
        paises.add("Argentina");
        paises.add("Colombia");
        paises.add("Perú");
        paises.add("Venezuela");
        Collections.sort(paises);
        System.out.println(paises);
    }
    
}
