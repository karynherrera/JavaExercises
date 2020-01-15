
package javaapplication1;
import java.util.ArrayList;
import java.lang.*;

public class contador {
    public static void main(String[] args) {
        String args2[] = {"100","40","60","230","95","400","25","50","0"};
        ArrayList<Integer> mins = new ArrayList<Integer>();
        int i; 
        int n =args2.length;
        for(i=0;i<n;i++) {
            mins.add(Integer.parseInt(args2[i]));
        }
    System.out.println(scanAddicts(mins));
       
    }
    
    static ArrayList<String> scanAddicts(ArrayList<Integer> minutos){
            ArrayList<String> resultado = new ArrayList<String>();
            int n =minutos.size();
            int i;
            for(i=0; i<n; i++){
                if(minutos.get(i)>90){
                    resultado.add("Mal");
                }
                else{
                    resultado.add("Bien");
                }
            }
            return resultado;
        }
}
