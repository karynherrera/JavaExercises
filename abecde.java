
package javaapplication1;

import java.util.ArrayList;

public class abcde {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        /*a.clear();*/
        String borrado = a.remove(1);  //a.remove("a"); //si hay mas de un elemento con el mismo valor eliminara el primero que coincida
        System.out.println(a);
        System.out.println("El valor eliminado es:"+ borrado);
        a.set(1,"k");
        System.out.println(a);
        System.out.println(a.size());
    }
    
    
}
