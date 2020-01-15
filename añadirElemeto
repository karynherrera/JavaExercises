package javaapplication1;

import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("pinha");
        ingredientes.add("jamon");
        ingredientes.add("salsa");
        ingredientes.add("queso");
        
       System.out.printf("Ingrese el nombre de un ingrediente \n");
       Scanner sc = new Scanner(System.in);
       String ingrediente = sc.nextLine();
       if(ingredientes.contains(ingrediente)){
           System.out.printf("Tiene el ingrediente \n");
       }
       else {
           ingredientes.add(ingrediente);
           System.out.printf("El ingrediente %s fue agregado\n",ingrediente);}
           System.out.println(ingredientes);
    }
  
}
